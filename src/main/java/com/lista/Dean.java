package com.lista;

import java.util.Arrays;

public class Dean extends Person  {
    private String academicDegree = "";
    private Teacher[] teachers = new Teacher[2];

    public Dean(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    public Dean(String nameFist, int age, int deposit, String academicDegree) {
        super(nameFist, age, deposit);
        this.academicDegree = academicDegree;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
        for (int i = 0; i < teachers.length; i++) {
            teachers[i].setDependence(this);
        }
    }

    @Override
    public String toString() {
        return "Dean{" +
                "academicDegree='" + academicDegree + '\'' +
                ", teachers=" + Arrays.toString(teachers) +
                "} " + super.toString();
    }

    public String showForTeachersDependence() {
        return "Dean{" +
                "} " + super.toString();
    }
}
