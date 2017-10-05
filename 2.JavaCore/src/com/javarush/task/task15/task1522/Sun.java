package com.javarush.task.task15.task1522;

/**
 * Created by Alex on 03.10.2017.
 */
public class Sun implements Planet{
    private static Sun instance;

    public static Sun getInstance() {
        if (instance == null){
            instance = new Sun();
        }
        return instance;
    }

    private Sun() {
    }
}
