package ru.netology.stats;

import org.junit.jupiter.api.Test;

import javax.print.DocFlavor;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatServiceTest {
    @Test
    void totalAmount() {
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.findTotalAmount(month);
        int expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void averageAmount() {
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.findAverageAmount(month);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void findMaximumMonth() {
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.findMax(months);
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    void findMinimumMonth() {
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.findMin(months);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void findUnprofitableMonths() {
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.findUnprofitableMonths(months);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void findProfitableMonths() {
        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.findProfitableMonths(months);
        int expected = 5;
        assertEquals(expected, actual);
    }
}

