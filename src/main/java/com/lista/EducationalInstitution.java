package com.lista;

public class EducationalInstitution {
    private Dean dean;
    private Teacher[] teachers;
    private Student[]students;

    public EducationalInstitution() {
    }

    public EducationalInstitution(Dean dean, Teacher[] teachers, Student[] students) {
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
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
