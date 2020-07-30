package ru.netology.stats;
import org.junit.jupiter.api.Test;
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
    void totalMaximumAmount() {
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.findMaximum(month);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void totalMinimalAmount() {
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.findMinimal(month);
        int expected = 9;
        assertEquals(expected, actual);

    }
}