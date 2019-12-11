package com.lista;

import java.io.Serializable;

public class Student extends Person implements Scientist, Serializable {
    private int avgRating = 0;
    private Teacher dependence;

    public Student(int avgRating) {
        this.avgRating = avgRating;
    }

    public Student(String nameFist, int age, int deposit) {
        super(nameFist, age, deposit);
    }

    public Teacher getDependence() {
        return dependence;
    }

    public void setDependence(Teacher dependence) {
        this.dependence = dependence;
    }

    public int getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(int avgRating) throws ExceptionMy {
        try {
            this.avgRating = avgRating(avgRating);
        } catch (ExceptionMy exceptionMy) {
            this.avgRating = this.avgRating;
            exceptionMy.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "avgRating=" + avgRating +
                ", dependence=" + dependence() +
                "} " + super.toString();
    }

    private int avgRating(int avgRating) throws ExceptionMy {
        if (avgRating > 0) {
            return avgRating;
        }
        throw new ExceptionMy("!avgRating > 0");
    }

    private String dependence() {
        return dependence.showForStudentDependence();
    }

    @Override
    public void learn() throws ExceptionMy { // учить

    }

    @Override
    public void learns() throws ExceptionMy { // учится

    }

}
