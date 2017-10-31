package com.javarush.task.task18.task1826;

/* 
Шифровка
*/


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
    if (args[0].equals("-e")){
        encrypt(args[1],args[2]);
    } else if (args[0].equals("-d")){
        decod(args[1], args[2]);
    }
    }

    static void encrypt (String a, String b) throws IOException {
        FileInputStream inputStream = new FileInputStream(a);
        FileOutputStream outputStream = new FileOutputStream(b);

        while (inputStream.available() > 0){
            int i = inputStream.read();
            outputStream.write(encrypt(i));
        }
        inputStream.close();
        outputStream.close();
    }

    static void decod (String a , String b) throws IOException {
        FileInputStream inputStream = new FileInputStream(a);
        FileOutputStream outputStream = new FileOutputStream(b);

        while (inputStream.available() > 0){
            int i = inputStream.read();
            outputStream.write(decod(i));
        }
        inputStream.close();
        outputStream.close();
    }

    static int encrypt (int a){
        if (a < 127){
             return ++a;
        } else {
             return -128;
        }
    }
    static int decod (int a){
        if (a != -128){
            return --a;
        }else {
            return 127;
        }
    }
}
