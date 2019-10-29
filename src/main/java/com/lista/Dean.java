package com.lista;

import java.util.Arrays;

public class Dean extends Person implements Scientist {
    private String academicDegree = "";
    private Teacher[] teachers = new Teacher[2];

    public Dean(int age, int deposit) {
        super(age, deposit);
    }

    public Dean(int age, int deposit, String academicDegree) {
        super(age, deposit);
        this.academicDegree = academicDegree;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "Dean{" +
                "academicDegree='" + academicDegree + '\'' +
                ", teachers=" + Arrays.toString(teachers) +
                '}';
    }


    @Override
    public void learn() throws ExceptionMy {

    }

    @Override
    public void learns() throws ExceptionMy {

    }
}
