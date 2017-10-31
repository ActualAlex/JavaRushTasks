package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader rr = new BufferedReader(new InputStreamReader(System.in));
        String name1 = rr.readLine();
        String name2 = rr.readLine();

        rr.close();

       ArrayList<String> list = new ArrayList<>();

       FileInputStream fileInputStream = new FileInputStream(name1);

       byte[] bytes = new byte[fileInputStream.available()];
       while (fileInputStream.available() > 0){
           fileInputStream.read(bytes);
       }

       fileInputStream.close();

       String s = new String(bytes);
       for (String a : s.split(" ")){
           float f = Float.parseFloat(a);
           list.add(Math.round(f) + " ");
       }

       FileOutputStream fileOutputStream = new FileOutputStream(name2);

        for (String a : list){
            fileOutputStream.write(a.getBytes());
        }

        fileOutputStream.close();





    }
}
