package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        return a;//напишите тут ваш код
    }

    public static int readInt() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(reader.readLine());
        return b;//напишите тут ваш код
    }

    public static double readDouble() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double c = Double.parseDouble(reader.readLine());
        return c;//напишите тут ваш код
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean d = Boolean.parseBoolean(reader.readLine());
        return d;//напишите тут ваш код
    }

    public static void main(String[] args) {

    }
}
