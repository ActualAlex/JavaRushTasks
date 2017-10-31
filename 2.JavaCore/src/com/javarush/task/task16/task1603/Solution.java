package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread thread1 = new SpecialThread();
        Thread thread01 = new Thread(thread1);
        list.add(thread01);

        SpecialThread thread2 = new SpecialThread();
        Thread thread02 = new Thread(thread2);
        list.add(thread02);

        SpecialThread thread3 = new SpecialThread();
        Thread thread03 = new Thread(thread3);
        list.add(thread03);

        SpecialThread thread4 = new SpecialThread();
        Thread thread04 = new Thread(thread4);
        list.add(thread04);

        SpecialThread thread5 = new SpecialThread();
        Thread thread05 = new Thread(thread5);
        list.add(thread05);//Add your code here - добавьте свой код тут
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
