package com.javarush.task.task15.task1522;

/**
 * Created by Alex on 03.10.2017.
 */
public class Moon implements Planet{
    private Moon(){}
    private static Moon instance;

    public static Moon getInstance(){
        if (instance == null){
            instance = new Moon();
        }
        return instance;
    }
}
