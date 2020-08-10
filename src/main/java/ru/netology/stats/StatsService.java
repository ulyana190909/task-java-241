package ru.netology.stats;

import javax.print.DocFlavor;
import java.lang.reflect.Array;

public class StatsService {
    public int findTotalAmount(int[] month) {
        int amount = 0;
        for (int total : month) {
            amount += total;
        }
        return amount;
    }

    public int findAverageAmount(int[] month) {
        int amount = 0;
        for (int total : month) {
            amount += total;
        }
        return amount / 12;
    }

    public int findMax(int[] months) {
        int maxIndex = 0;
        for (int i = 1; i < months.length; i++) {
            if (months[i] >= months[maxIndex])
                maxIndex = i;
        }
        return maxIndex;
    }

    public int findMin(int[] months) {
        int minIndex = 0;
        for (int i = 1; i < months.length; i++) {
            if (months[i] <= months[minIndex])
                minIndex = i;
        }
        return minIndex;
    }


    public int findUnprofitableMonths(int[] months) {
        StatsService unprofitable = new StatsService();
        unprofitable.findAverageAmount(months);
        int averageProfit = findAverageAmount(months);
        int monthsCounter = 0;
        for (int i = 1; i < months.length; i++) {
            if (months[i] < averageProfit)
                monthsCounter = monthsCounter + 1;
        }
        return monthsCounter;

    }

    public int findProfitableMonths(int[] months) {
        StatsService profitable = new StatsService();
        profitable.findAverageAmount(months);
        int averageProfit = findAverageAmount(months);
        int monthsCounter = 0;
        for (int i = 1; i < months.length; i++) {
            if (months[i] > averageProfit)
                monthsCounter = monthsCounter + 1;
        }
        return monthsCounter;
    }

}




