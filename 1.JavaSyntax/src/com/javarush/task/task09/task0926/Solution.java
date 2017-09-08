package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> ints = new ArrayList<>();
        int[] a = {1,2,3,4,5};
        ints.add(a);
        int[] b = {1,2};
        ints.add(b);
        int[] c = {1,2,3,4};
        ints.add(c);
        int[] d = {1,2,3,4,5,6,7};
        ints.add(d);
        int[] e = {};
        ints.add(e);
        return ints;//напишите тут ваш код//напишите тут ваш код
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
