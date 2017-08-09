package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();

        String sum = reader.readLine();
        int s = Integer.parseInt(sum);

        String let = reader.readLine();
        int l = Integer.parseInt(let);
        System.out.println(name+" получает "+s+ " через "+l + " лет.");
    }

}
