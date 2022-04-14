package com.dajuancai.pojo;

public class Account {
    private int id ;
    private double money;
    private String name;

    public Account() {
    }

    public Account(int id, double money, String name) {
        this.id = id;
        this.money = money;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", money=" + money +
                ", name='" + name + '\'' +
                '}';
    }
}
