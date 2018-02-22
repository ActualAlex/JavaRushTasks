package com.javarush.task.task26.task2610;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by Alex on 13.12.2017.
 */
public class Consumer implements Runnable {
    private BlockingQueue queue;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        for (Object f : queue){
            System.out.println(f);
        }
        queue.remove();

        }


}
