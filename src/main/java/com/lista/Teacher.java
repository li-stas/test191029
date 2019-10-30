package com.lista;

import java.util.Arrays;

public class Teacher extends Person implements Scientist {
    private int salary = 0;
    private Student[] students = new Student[5];


    public Teacher(int salary) {
        this.salary = salary;
    }

    public Teacher(String nameFist, int age, int deposit, int salary) {
        super(nameFist, age, deposit);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                ", students=" + Arrays.toString(students) +
                "} " + super.toString();
    }

    @Override
    public void learn() throws ExceptionMy {

    }

    @Override
    public void learns() throws ExceptionMy {

    }
}
