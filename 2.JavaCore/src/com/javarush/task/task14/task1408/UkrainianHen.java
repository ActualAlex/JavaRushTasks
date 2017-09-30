package com.javarush.task.task14.task1408;

/**
 * Created by Alex on 29.09.2017.
 */
public class UkrainianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 300;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE+ ". Я несу " + getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
