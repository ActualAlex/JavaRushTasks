package com.javarush.task.task14.task1408;

/**
 * Created by Alex on 29.09.2017.
 */
public class BelarusianHen extends Hen {
    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() +" яиц в месяц.";
    }

    @Override
    int getCountOfEggsPerMonth() {
        return 400;
    }
}
