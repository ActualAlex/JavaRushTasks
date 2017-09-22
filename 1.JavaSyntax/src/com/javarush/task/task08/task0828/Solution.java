package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       HashMap<String, Integer> m = new HashMap<>();
       m.put("January",1);//напишите тут ваш код
       m.put("February",2);//напишите тут ваш код
       m.put("March",3);//напишите тут ваш код
       m.put("April",4);//напишите тут ваш код
       m.put("May",5);//напишите тут ваш код
       m.put("June",6);//напишите тут ваш код
       m.put("July",7);//напишите тут ваш код
       m.put("August",8);//напишите тут ваш код
       m.put("September",9);//напишите тут ваш код
       m.put("October",10);//напишите тут ваш код
       m.put("November",11);//напишите тут ваш код
       m.put("December",12);//напишите тут ваш код

        String a =reader.readLine();

        if (m.containsKey(a)){
            System.out.println(a +" is "+ m.get(a)+ " month");
        }
    }

}
