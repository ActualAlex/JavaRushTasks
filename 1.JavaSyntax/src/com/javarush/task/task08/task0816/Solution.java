package com.javarush.task.task08.task0816;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Sanio", new Date("NOVEMBER 1 1912"));
        map.put("Pika", new Date("JUNE 1 1983"));
        map.put("Finter", new Date("JUNE 1 1989"));
        map.put("Muren", new Date("JUNE 1 1999"));
        map.put("Kile", new Date("JUNE 1 1980"));
        map.put("Plioni", new Date("JUNE 1 1986"));
        map.put("Mustafio", new Date("JUNE 1 1950"));
        map.put("Delicio", new Date("JUNE 1 1970"));
        map.put("Karnize", new Date("JUNE 1 1940"));

        return map; //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (Map.Entry<String, Date> m : map.entrySet()) {
            Date date = m.getValue();
            int a = date.getMonth();
            if (a > 4 && a < 8) {
                arrayList.add(m.getKey());
            }

        }
        for (String s : arrayList) {
            map.remove(s);
        }
    }

    public static void main(String[] args) {

    }
}
