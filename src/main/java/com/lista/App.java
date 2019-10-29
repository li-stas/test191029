package com.lista;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Student stud0 = new Student(18, 1000);
        Student stud1 = new Student(18, 1001);
        Student stud2 = new Student(18, 1002);
        Student stud3 = new Student(18, 1003);
        Student stud4 = new Student(18, 1004);

        Student stud5 = new Student(18, 1005);
        Student stud6 = new Student(18, 1006);
        Student stud7 = new Student(18, 1007);
        Student stud8 = new Student(18, 1008);
        Student stud9 = new Student(18, 1009);

        Teacher teach1 = new Teacher(31, 1010, 1000);
        Teacher teach2 = new Teacher(32, 1020, 1000);

        Dean dean = new Dean(32, 1020, "II");

        if (true) {
            teach1.setStudents( new Student[] {stud0,stud1,stud2,stud3,stud4});
            teach1.setStudents( new Student[] {stud5,stud6,stud7,stud8,stud9});
        }
        Teacher[] teach4dean = new Teacher[]{teach1, teach2};
        dean.setTeachers(teach4dean);     //dean.setTeachers(new Teacher[]{teach1, teach2});


        System.out.println(dean);
        //System.out.println(teach1);
        //System.out.println(teach2);
    }
}
