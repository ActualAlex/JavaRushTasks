package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String,String>();
        map.put("Петренко", "Владислав");//напишите тут ваш код
        map.put("Ищюк", "Татьяна");//напишите тут ваш код
        map.put("Пупкин", "Василий");//напишите тут ваш код
        map.put("Пенкываы", "Владислав");//напишите тут ваш код
        map.put("Шерстюк", "Ольга");//напишите тут ваш код
        map.put("Носов", "Евгений");//напишите тут ваш код
        map.put("Полько", "Антонина");//напишите тут ваш код
        map.put("Берникова", "Инга");//напишите тут ваш код
        map.put("Петрон", "Юлия");//напишите тут ваш код
        map.put("Петттерс", "Фатима");//напишите тут ваш код
        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
       int count = 0;
       for (Map.Entry<String,String> m : map.entrySet()){
           String a = m.getValue();
           if (a.equals(name)) {
               count++;
           }
       }
       return count;


    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry<String,String> m : map.entrySet()){
            String k = m.getKey();
            if (k.equals(lastName)){
                count++;//напишите тут ваш код
            }
        }
return count;
    }

    public static void main(String[] args) {
    }
}
