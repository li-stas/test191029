package com.lista;

import java.util.Arrays;

public class Teacher extends Person implements Scientist {
    private int salary = 0;
    private Student[] students = new Student[5];
    private Dean dependence;


    public Teacher(int salary) {
        this.salary = salary;
    }

    public Teacher(String nameFist, int age, int deposit, int salary) {
        super(nameFist, age, deposit);
        this.salary = salary;
    }

    public Dean getDependence() {
        return dependence;
    }

    public void setDependence(Dean dependence) {
        this.dependence = dependence;
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
        for (int i = 0; i < students.length; i++) {
            students[i].setDependence(this);
        }

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                ", students=" + Arrays.toString(students) +
                ", dependence=" + dependence() +
                "} " + super.toString();
    }

    private String dependence() {
        return dependence.showForTeachersDependence();
    }


    public String showForStudentDependence() {
        return "Teacher{" +
                "} " + super.toString();
    }
    @Override
    public void learn() throws ExceptionMy {

    }

    @Override
    public void learns() throws ExceptionMy {

    }
}
