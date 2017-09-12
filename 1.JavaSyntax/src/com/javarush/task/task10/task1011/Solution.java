package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        StringBuilder s1 = new StringBuilder(s);
        for (int a = 0; a < 40; a++) {
            if (s1.charAt(0) != ' ') {
                System.out.println(s1);
                s1.deleteCharAt(0);//напишите тут ваш код//напишите тут ваш код
            } else {
                s1.deleteCharAt(0);
                System.out.println(s1);
            }

        }

    }

}

