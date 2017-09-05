package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("Sidorov", "Petro");//напишите тут ваш код
        map.put("Kadirov", "Alex");//напишите тут ваш код
        map.put("Senin", "Fed");//напишите тут ваш код
        map.put("Kirkorov", "Filya");//напишите тут ваш код
        map.put("Sheva", "Dima");//напишите тут ваш код
        map.put("Kredo", "Vak");//напишите тут ваш код
        map.put("Pedro", "San");//напишите тут ваш код
        map.put("Dyrin", "Tima");//напишите тут ваш код
        map.put("Feigin", "Sancho");//напишите тут ваш код
        map.put("Nintena", "Petro");//напишите тут ваш код
             return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        ArrayList<String> lst = new ArrayList<String>(map.values());

        int count;
        for (String str : lst) {
            count = 0;
            for (String str2 : lst) {
                if (str.equals(str2))
                    count++;
                if (count==2) removeItemFromMapByValue (map, str);
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
