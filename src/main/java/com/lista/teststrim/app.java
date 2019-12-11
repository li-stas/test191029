package com.lista.teststrim;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class app {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {

        Class c = Class.forName("com.lista.hobb.App");


        Constructor[] cons = c.getConstructors();
        printList("Constructors", cons);
        Method[] meths = c.getMethods();
        printList("Methods", meths);
        //Field[] fields = c.getFields();
        //printList("Fields", fields);
        Field[] fields1 = c.getDeclaredFields();
        printList("Fields1", fields1);

        Method testRR;
        Class[] params;
        Object[] arg;

        Class c1 = Class.forName("com.lista.hobb.App");
        testRR = c1.getMethod("setC", double.class);
        testRR.setAccessible(true);
        testRR.invoke(testRR, 12.12);

        params = new Class[]{int.class, java.lang.String.class, double.class};
        testRR = c.getMethod("test", params);
        testRR.setAccessible(true);
        System.out.println( "testRR->"+ testRR);

        arg = new Object[]{5, new String("String"), 12.12};
        testRR.invoke(testRR, arg);


        //(c,5, "String", 12.12 );
        //System.out.print( " invoke="+ invoke);
    }


    static void printList(String s, Object[] o) {
        System.out.println("*** " + s + " ***");
        for (int i = 0; i < o.length; i++)
            System.out.println(o[i].toString());
    }

}
