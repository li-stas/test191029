package com.lista;

public class Student extends Person {
    private int avgRating = 0;
    public Student(int age, int deposit) {
        super(age, deposit);
    }

    public Student(int age, int deposit, int avgRating) {
        super(age, deposit);
        this.avgRating = avgRating;
    }

    public int getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(int avgRating) {
        this.avgRating = avgRating;
    }

    @Override
    public String toString() {
        return "student{" +
                "avgRating=" + avgRating +
                "deposit=" + getDeposit() +
                '}';
    }
}
