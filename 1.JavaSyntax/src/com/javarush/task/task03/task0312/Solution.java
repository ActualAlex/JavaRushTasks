package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    public static int convertToSeconds(int hour){
        int i = hour * 3600;
        return i;
    } //напишите тут ваш код

    public static void main(String[] args) {
        System.out.println(convertToSeconds(3));
        System.out.println(convertToSeconds(4));//напишите тут ваш код
    }
}
