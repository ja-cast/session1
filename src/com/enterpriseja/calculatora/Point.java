package com.enterpriseja.calculatora;

public class Point {
    private int x;
    private int y;
    private int z;
    private String name;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x) {
        this.x = x;
    }

    public Point() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if(x<0){
            System.out.println("Value can not be less than zero");
            return;
        }
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == ""){
            System.out.println("Nanme can not be empty");
        }
        this.name = name;
    }

    void sayHi(String name){
        System.out.println("Hi "+name);
    }
}
