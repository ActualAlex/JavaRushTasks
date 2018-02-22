package com.javarush.task.task29.task2909.human;

/**
 * Created by Alex on 12.12.2017.
 */
public class Soldier extends Human {
    public void live() {
        fight();
    }
    public void fight() {
    }
    public Soldier(String nsme, int age){
        super(nsme,age);
    }
}
