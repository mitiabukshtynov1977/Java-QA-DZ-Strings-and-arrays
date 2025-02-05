package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesStatisticsTest {

    SalesStatistics service = new SalesStatistics();
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void shouldCalcSumOfSales() {
        long actual = service.sumOfSales(sales);
        long expected = 180; // Исправлено на long

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countCalcAverageSumOfSales() {
        long actual = service.averageSumOfSales(sales);
        long expected = 15; // Исправлено на long

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcNumMonthOfMaxSales() {
        int actual = service.numMonthOfMaxSales(sales);
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcNumMonthOfMinSales() {
        int actual = service.numMonthOfMinSales(sales);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcCountMonthOfSalesBelowAverage() {
        int actual = service.countMonthOfSalesBelowAverage(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcCountMonthOfSalesAboveAverage() {
        int actual = service.countMonthOfSalesAboveAverage(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}
