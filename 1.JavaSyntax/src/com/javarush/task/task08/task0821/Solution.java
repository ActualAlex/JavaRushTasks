package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String, String> map = new HashMap<>();//напишите тут ваш код
        map.put("Сидоров", "Петр");
        map.put("Печкин", "Василий");
        map.put("Сидоров", "Илья");
        map.put("Гришин", "Саня");
        map.put("Нишин", "Вова");
        map.put("Шумилкин", "Мурат");
        map.put("Учбек", "Али");
        map.put("Миланов", "Гид");
        map.put("Синицин", "Саша");
        map.put("Сидоров", "Петр");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
