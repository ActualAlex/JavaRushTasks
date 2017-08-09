package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public Cat(String name) {
        this.name = name;
        this.age = 3;
        this.weight = 4;
        this.color = "Black";
        this.address = null;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "Black";
        this.address = null;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 4;
        this.color = "Black";
        this.address = null;
    }

    public Cat(int weight, String color) {
        this.name = null;
        this.age = 3;
        this.weight = weight;
        this.color = color;
        this.address = null;
    }

    public Cat(int weight, String color, String adress) {
        this.name = null;
        this.age = 3;
        this.weight = weight;
        this.color = color;
        this.address = adress;
    }
    public static void main(String[] args) {

    }
}
