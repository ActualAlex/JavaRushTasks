package com.javarush.task.task21.task2113;

/**
 * Created by Alex on 14.11.2017.
 */
public class Horse {
    String name;
    double speed;
    double distance;

    public Horse(String name, double speed, double distance){
        this.name = name;
        this.distance = distance;
        this.speed = speed;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSpeed(){
        return speed;
    }
    public void setSpeed(double speed){
        this.speed = speed;
    }
    public double getDistance(){
        return distance;
    }
    public void setDistance(double distance){
        this.distance = distance;
    }

    public void move(){
        distance += Math.random() * speed;
    }
    public void print(){
        for (int n = (int) distance; n > 0; n--){
            System.out.print(".");
        }
        System.out.print(name);
    }
}
