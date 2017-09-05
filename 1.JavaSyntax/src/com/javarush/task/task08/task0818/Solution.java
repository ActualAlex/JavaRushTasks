package com.javarush.task.task08.task0818;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Первый", 600);//напишите тут ваш код
        map.put("Второй", 700);//напишите тут ваш код
        map.put("Третий", 450);//напишите тут ваш код
        map.put("Четвертый", 120);//напишите тут ваш код
        map.put("Пятый", 400);//напишите тут ваш код
        map.put("Шестой", 130);//напишите тут ваш код
        map.put("Седьмой", 330);//напишите тут ваш код
        map.put("Восьмой", 770);//напишите тут ваш код
        map.put("Девятый", 6000);//напишите тут ваш код
        map.put("Десятый", 6020);//напишите тут ваш код
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            if (m.getValue() < 500) {
                list.add(m.getKey());//напишите тут ваш код
            }
        }
        for (String s : list) {
            if (map.containsKey(s)) map.remove(s);
        }
    }

    public static void main(String[] args) {

    }
}