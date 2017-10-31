package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream outputStream = new FileOutputStream(reader.readLine());
        FileInputStream inputStream1 = new FileInputStream(reader.readLine());
        FileInputStream inputStream2 = new FileInputStream(reader.readLine());

        reader.close();

        byte[] file1 = new byte[inputStream1.available()];
        byte[] file2 = new byte[inputStream2.available()];

        while (inputStream1.available() > 0){
            inputStream1.read(file1);
            outputStream.write(file1);
        }
        while (inputStream2.available() > 0){
            inputStream2.read(file2);
            outputStream.write(file2);
        }

        outputStream.close();
        inputStream1.close();
        inputStream2.close();
    }
}
