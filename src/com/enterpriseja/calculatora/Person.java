package com.enterpriseja.calculatora;

public class Person {
    private int age;
    private String name;
    private float height;

    public Person(int age, String name, float height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
