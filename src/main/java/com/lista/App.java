package com.lista;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Student stud0 = new Student("stud0",18, 1000);
        Student stud1 = new Student("stud1",18, 1001);
        Student stud2 = new Student("stud2",18, 1002);
        Student stud3 = new Student("stud3",18, 1003);
        Student stud4 = new Student("stud4",18, 1004);

        Student stud5 = new Student("stud5",18, 1005);
        Student stud6 = new Student("stud6",18, 1006);
        Student stud7 = new Student("stud7",18, 1007);
        Student stud8 = new Student("stud8",18, 1008);
        Student stud9 = new Student("stud9",18, 1009);

        Teacher teach1 = new Teacher("teach1",31, 1010, 2010);
        Teacher teach2 = new Teacher("teach1",32, 1020, 3020);

        Dean dean = new Dean("Dean",62, 1020, "II");

        // создали заведение
        Zsmk49 zsmk49 = new Zsmk49();
        zsmk49.setDean(dean); // добавили Декана
        zsmk49.setTeachers(new Teacher[]{teach1, teach2}); // добавили двух учителей
        zsmk49.setStudents(new Student[]
                {stud0,stud1,stud2,stud3,stud4,stud5,stud6,stud7,stud8,stud9
                }); // студентов


        zsmk49.getDean().setTeachers( new Teacher[]{teach1,teach2});

        /*
        System.out.println(zsmk49.getTeachers()[0]);
        System.out.println(zsmk49.getTeachers()[1]);
        System.out.println(zsmk49.getStudents()[0]);
        */

        zsmk49.getTeachers()[0].setStudents(new Student[] {
                 zsmk49.getStudents()[0]
                ,zsmk49.getStudents()[1]
                ,zsmk49.getStudents()[2]
                ,zsmk49.getStudents()[3]
                ,zsmk49.getStudents()[4]
        });

        //zsmk49.getTeachers()[0].setStudents(zsmk49.getStudents());


        zsmk49.getTeachers()[1].setStudents(new Student[] {
                zsmk49.getStudents()[5]
                ,zsmk49.getStudents()[6]
                ,zsmk49.getStudents()[7]
                ,zsmk49.getStudents()[8]
                ,zsmk49.getStudents()[9]
        });

        System.out.println(stud0);
        System.out.println(teach1);
        System.out.println(dean);
        //System.out.println(teach2);
    }
}
