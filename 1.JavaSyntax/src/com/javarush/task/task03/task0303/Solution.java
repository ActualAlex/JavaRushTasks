package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(3,4));
        System.out.println(convertEurToUsd(4,6.3));//напишите тут ваш код
    }

    public static double convertEurToUsd(int eur, double course) {
        double dol = eur* course;//напишите тут ваш код
        return dol;
    }
}
