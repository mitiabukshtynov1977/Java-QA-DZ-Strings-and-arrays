package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SalesStatisticsTest {


    SalesStatistics service = new SalesStatistics();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void shouldCalcSumOfSales() {


        long actual = service.sumOfSales(sales);
        long expected = 180;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countCalcAverageSumOfSales() {

        long actual = service.averageSumOfSales(sales);
        long expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcNumMonthOfMaxSales() {

        long actual = service.numMonthOfMaxSales(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcNumMonthOfMinSales() {

        long actual = service.numMonthOfMinSales(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcCountMonthOfSalesBelowAverage() {

        long actual = service.countMonthOfSalesBelowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcCountMonthOfSalesAboveAverage() {

        long actual = service.countMonthOfSalesAboveAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

}
