package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        PrintStream printStream = System.out;

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(baos);

        System.setOut(stream);
        testString.printSomething();
        System.setOut(printStream);

        BufferedReader reader = new BufferedReader(new StringReader(baos.toString()));
        String str;
        int count = 0;
        while ((str = reader.readLine())  != null) {
                System.out.println(str);
                count++;
             if (count % 2 == 0) {
                System.out.println("JavaRush - курсы Java онлайн");
            }
        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
