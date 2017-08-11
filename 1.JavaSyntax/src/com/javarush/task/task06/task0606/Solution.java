package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int c = Integer.parseInt(number);

        while (c > 0) {
            if (c % 2 == 0)
                even++;
            else odd++;
            c = c / 10;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
        //напишите тут ваш код
    }
}
