package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        FileInputStream fileInputStream1 = new FileInputStream(file1);
        FileInputStream fileInputStream2 = new FileInputStream(file2);


        ArrayList<Integer> list = new ArrayList<>();

        while (fileInputStream2.available() > 0){
            list.add(fileInputStream2.read());
        }
        fileInputStream2.close();

        while (fileInputStream1.available() > 0){
            list.add(fileInputStream1.read());
        }
        fileInputStream1.close();

        FileOutputStream fileOutputStream1 = new FileOutputStream(file1);

        for (int a : list){
            fileOutputStream1.write(a);
        }
        fileOutputStream1.close();
    }
}
