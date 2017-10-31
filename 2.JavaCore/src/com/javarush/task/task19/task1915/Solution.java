package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();

        PrintStream printStream = System.out;
        ByteArrayOutputStream bs = new ByteArrayOutputStream();
        PrintStream printStream1 = new PrintStream(bs);
        System.setOut(printStream1);
        testString.printSomething();
        System.setOut(printStream);
        FileOutputStream fileOutputStream = new FileOutputStream(s);
        fileOutputStream.write(bs.toByteArray());
        fileOutputStream.close();
        System.out.println(bs.toString());
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

