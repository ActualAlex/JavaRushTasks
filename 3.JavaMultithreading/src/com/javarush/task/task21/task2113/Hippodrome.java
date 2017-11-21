package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 14.11.2017.
 */
public class Hippodrome {
    static Hippodrome game;
    private List<Horse> horses;
    public List<Horse> getHorses(){
        return horses;
    }

    public Hippodrome(List list){
        horses = list;
    }

    public void move(){
        for (Horse h : horses){
            h.move();
        }
    }
    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++){
            move();
            print();
            Thread.sleep(200);
        }
    }
    public void print(){
        for (Horse h : horses){
            h.print();
        }
        for (int i = 0; i <10; i++){
            System.out.println("");
        }
    }
    public Horse getWinner(){
        Horse winner = null;
        for (Horse h : horses){
            if (winner == null){
                winner = h;
            }
            if (winner.distance < h.distance ){
                winner = h;
            }
        }
        return winner;
    }
    public void printWinner(){
        System.out.println("Winner is " + getWinner().name +"!");
    }

    public static void main(String[] args) throws InterruptedException {
        List<Horse> horsi = new ArrayList<>();
        Horse a1 = new Horse("Маша",3,0);
        Horse a2 = new Horse("Даша",3,0);
        Horse a3 = new Horse("Наташа",3,0);
        horsi.add(a1);
        horsi.add(a2);
        horsi.add(a3);
        game = new Hippodrome(horsi);
        game.run();
        game.printWinner();
    }
}
