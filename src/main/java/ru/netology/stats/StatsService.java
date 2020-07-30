package ru.netology.stats;

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

    public int findMaximum(int[] month) {
        int maxNumber = month[0];
        int amountMax = 20;
        int a;
        for (a = 1; a < month.length; a++) {
            amountMax = Math.max(maxNumber, month[a]);
        }
        return maxNumber;
    }

    public int findMinimal(int[] month) {
        int minNumber = month[0];
        int amountMin = 7;
        int a;
        for (a = 1; a < month.length; a++) {
            amountMin = Math.min(minNumber, month[a]);
        }
        return minNumber;
    }
}
