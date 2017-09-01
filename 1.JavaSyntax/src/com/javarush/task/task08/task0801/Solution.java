package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<String> set = new HashSet<String>();
        set.add("арбуз");//напишите тут ваш код
        set.add("банан");//напишите тут ваш код
        set.add("вишня");//напишите тут ваш код
        set.add("груша");//напишите тут ваш код
        set.add("дыня");//напишите тут ваш код
        set.add("ежевика");//напишите тут ваш код
        set.add("жень-шень");//напишите тут ваш код
        set.add("земляника");//напишите тут ваш код
        set.add("ирис");//напишите тут ваш код
        set.add("картофель");//напишите тут ваш код

        for (String x: set) {
            System.out.println(x);
        }

    }
}
