package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("sdfds");//напишите тут ваш код
        list.add("sdfds21");//напишите тут ваш код
        list.add("sdfdswqeqw");//напишите тут ваш код
        list.add("sdfds2312321e2");//напишите тут ваш код
        list.add("sdfds123213ee22ee2");//напишите тут ваш код
        System.out.println(list.size());
        for (int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
