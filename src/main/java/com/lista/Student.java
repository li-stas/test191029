package com.lista;

public class Student extends Person implements Scientist{
    private int avgRating = 0;

    public Student(int avgRating) {
        this.avgRating = avgRating;
    }

    public Student(String nameFist, int age, int deposit) {
        super(nameFist, age, deposit);
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
                "} " + super.toString();
    }

    private int avgRating(int avgRating) throws ExceptionMy {
        if (avgRating > 0) {
            return avgRating;
        }
        throw new ExceptionMy("!avgRating > 0");
    }

    @Override
    public void learn() throws ExceptionMy { // учить

    }

    @Override
    public void learns() throws ExceptionMy { // учится

    }
}
