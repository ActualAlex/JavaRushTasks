package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        String z = "зима";
        String v = "весна";
        String l = "лето";
        String o = "осень";
         if (month ==12 || month==1 || month == 2) {
             System.out.println(z);
         } if (month==3 || month==4 || month ==5){
            System.out.println(v);
        } if (month==6||month==7 || month==8){
            System.out.println(l);
        } if (month==9 || month==10 || month==11){
            System.out.println(o);
        }
        }
    }
