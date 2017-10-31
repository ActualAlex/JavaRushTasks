package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

public class Solution {
        int intVar;
        double doubleVar;
        Double DoubleVar;
        boolean booleanVar;
        Object ObjectVar;
        Exception ExceptionVar;
        String StringVar;

    public static void main(String[] args) {
        Solution a = new Solution();
        System.out.println(a.intVar + " " + a.doubleVar + " " + a.DoubleVar + " " + a.booleanVar + " " + a.ObjectVar + " " + a.ExceptionVar + " " + a.StringVar );
    }
}
