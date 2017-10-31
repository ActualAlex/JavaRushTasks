package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList<String> listString = new ArrayList<>();
        ArrayList<Integer> listInt = new ArrayList<>();

        for (String s : array){
            if (isNumber(s)){
                listInt.add(Integer.parseInt(s));
            }else listString.add(s);
        }

        Collections.sort(listInt,Collections.reverseOrder());
        Collections.sort(listString);

        isGreaterThan("s","a"); //звглушка

        for (int i = 0,indexInt = 0,indexString = 0; i < array.length; i++ ){
            if (isNumber(array[i])){
                array[i] = Integer.toString(listInt.get(indexInt++));
            } else array[i] = listString.get(indexString++);
        }
        }

    //напишите тут ваш код


    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
