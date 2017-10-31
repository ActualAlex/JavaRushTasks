package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream printStream = System.out;
        ByteArrayOutputStream bs = new ByteArrayOutputStream();
        PrintStream newPrint = new PrintStream(bs);
        System.setOut(newPrint);
        testString.printSomething();
        System.setOut(printStream);
        String[] array = bs.toString().replaceAll("\\D+$","").split("\\s");
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[2]);
        int c = 0;
        switch (array[1]){
            case "+" : c = a + b; break;
            case "*" : c = a * b; break;
            case "-" : c = a - b; break;
        }
        System.out.println(a + " "+ array[1] + " " + b + " = " + c);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

