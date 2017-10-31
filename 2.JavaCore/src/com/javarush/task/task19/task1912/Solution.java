package com.javarush.task.task19.task1912;

/* 
Ридер обертка 2
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream printStream = System.out;

        ByteArrayOutputStream b = new ByteArrayOutputStream();

        PrintStream newPrintStream = new PrintStream(b);

        System.setOut(newPrintStream);

        testString.printSomething();

        System.setOut(printStream);

        System.out.println(b.toString().replace("te","??"));

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
