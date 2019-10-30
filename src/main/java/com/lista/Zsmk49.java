package com.lista;

import java.util.Arrays;

public class Zsmk49 extends EducationalInstitution {
    private Dean dean;
    private Teacher[] teachers = new Teacher[2];
    private Student[]students = new Student[10];

    public Zsmk49() {
    }

    public Zsmk49(Dean dean, Teacher[] teachers, Student[] students) {
        this.dean = dean;
        this.teachers = teachers;
        this.students = students;
    }

    public Dean getDean() {
        return dean;
    }

    public void setDean(Dean dean) {
        this.dean = dean;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public Student[] getStudents() {
        return this.students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Zsmk49{" +
                "dean=" + dean +
                ", teachers=" + Arrays.toString(teachers) +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
