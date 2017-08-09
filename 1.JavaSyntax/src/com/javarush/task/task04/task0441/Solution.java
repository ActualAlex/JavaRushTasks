package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int a = Integer.parseInt(reader.readLine());//напишите тут ваш код
       int b = Integer.parseInt(reader.readLine());//напишите тут ваш код
       int c = Integer.parseInt(reader.readLine());//напишите тут ваш код
        if (a>b & a>c) {
            if (b>c) System.out.println(b);
            else System.out.println(c);
        }
        else if (b>c & b>a) {
            if (c>a) System.out.println(c);
            else System.out.println(a);
        }
        else if (c>b &c>a) {
            if (b>a) System.out.println(b);
            else System.out.println(a);
        }
        else if (a==b & b==c)
            System.out.println(a);

    }
}
