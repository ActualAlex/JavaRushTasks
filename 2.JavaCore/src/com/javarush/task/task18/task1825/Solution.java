package com.javarush.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> fileName = new TreeSet<>();

        String path = null;

        while (true){
            String s = reader.readLine();
            if (s.equals("end")){
                break;
            } else {
                fileName.add(s);
                path = s.substring(0,s.lastIndexOf(".part"));
            }
        }
        reader.close();

        FileOutputStream outputStream = new FileOutputStream(path);

       for (String name : fileName){
           FileInputStream inputStream = new FileInputStream(name);
           byte[] bytes = new byte[inputStream.available()];
           while (inputStream.available() > 0){
               inputStream.read(bytes);
               outputStream.write(bytes);
           }
           inputStream.close();
       }
       outputStream.close();
    }
}
