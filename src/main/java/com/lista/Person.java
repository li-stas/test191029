package com.lista;

public class Person {
    private int age = 0;
    //private String gender ="";
    private int deposit = 0;

    public Person(int age, int deposit) {
        this.age = age;
        this.deposit = deposit;
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

}
