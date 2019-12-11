package com.lista;

import java.io.Serializable;

public class Person implements Serializable {
    private String nameFist = "";
    private int age = 0;
    private int deposit = 0;

    public Person() {
    }

    public Person(String nameFist, int age, int deposit) {
        this.nameFist = nameFist;
        this.age = age;
        this.deposit = deposit;
    }

    public String getNameFist() {
        return nameFist;
    }

    public void setNameFist(String nameFist) {
        this.nameFist = nameFist;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public void addDeposit (int nAddSum) {
        deposit += nAddSum;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nameFist='" + nameFist + '\'' +
                ", age=" + age +
                ", deposit=" + deposit +
                '}';
    }
}
