package ru.netology.stats;

public class SalesStatistics {

    public long sumOfSales(int[] sales) {
        long sum = 0; // Общие продажи
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSumOfSales(int[] sales) {
        long sum = sumOfSales(sales);
        return sum / sales.length; // Средние продажи
    }

    public int numMonthOfMaxSales(int[] sales) {
        int maxMonth = 0; // Месяц максимальных продаж
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int numMonthOfMinSales(int[] sales) {
        int minMonth = 0; // Месяц минимальных продаж
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int countMonthOfSalesBelowAverage(int[] sales) {
        int count = 0;
        long averageSum = averageSumOfSales(sales); // Месяцы продаж ниже среднего
        for (int sale : sales) {
            if (sale < averageSum) {
                count++;
            }
        }
        return count;
    }

    public int countMonthOfSalesAboveAverage(int[] sales) {
        int count = 0;
        long averageSum = averageSumOfSales(sales); // Месяцы продаж выше среднего
        for (int sale : sales) {
            if (sale > averageSum) {
                count++;
            }
        }
        return count;
    }
}