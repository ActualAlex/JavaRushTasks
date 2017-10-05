package com.javarush.task.task14.task1421;

/**
 * Created by Alex on 03.10.2017.
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton(){

    }
    public static Singleton getInstance(){
        return instance;
    }
}
