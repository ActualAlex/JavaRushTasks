package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int y = Integer.parseInt(reader.readLine());//напишите тут ваш код
        int m = Integer.parseInt(reader.readLine());//напишите тут ваш код
        int d = Integer.parseInt(reader.readLine());//напишите тут ваш код
        System.out.println("Меня зовут "+name+".");
        System.out.println("Я родился "+d+"."+m+"."+y);
    }
}
