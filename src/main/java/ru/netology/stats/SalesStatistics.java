package ru.netology.stats;

public class SalesStatistics {




    public long sumOfSales(long[] sales) {
        long sum = 0; // Общие продажи
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSumOfSales(long[] sales) {
        long sum = sumOfSales(sales);
        return sum / sales.length; // Средние продажи
    }

    public int numMonthOfMaxSales(long[] sales) {
        int maxMonth = 0; // Месяц максимальных продаж
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int numMonthOfMinSales(long[] sales) {
        int minMonth = 0; // Месяц минимальных продаж
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int countMonthOfSalesBelowAverage(long[] sales) {
        int count = 0;
        long averageSumOfSales = averageSumOfSales(sales); // Месяцы продаж ниже среднего
        for (long sale : sales) {
            long averageSum = 0;
            if (sale < averageSum) {
                count++;
            }
        }
        return count;
    }

    public int countMonthOfSalesAboveAverage(long[] sales) {
        int count = 0;
        long averageSum =  averageSumOfSales(sales); // Месяцы продаж выше среднего
        for (long sale : sales) {
            if (sale > averageSum) {
                count++;
            }
        }
        return count;
    }
}