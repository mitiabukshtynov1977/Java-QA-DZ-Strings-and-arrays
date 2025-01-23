package ru.netology.stats;

public class SalesStatistics {

    public long sumOfSales(long[] sales) {
        long sum = 0; // Общие продажи
        for (long i = 0; i < sales.length; i++) {
            sum += sales[(int) i];
        }
        return sum;
    }

    public long averageSumOfSales(long[] sales) {
        long sum = 0;
        long averageSum = 0;  // Средние продажи
        for (long i = 0; i < sales.length; i++) {
            sum += sales[(int) i];
            averageSum = (sum / sales.length);
        }
        return averageSum;
    }


    public long numMonthOfMaxSales(long[] sales) {
        int maxMonth = 0; // Месяцев Максимальных продаж
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] >= sales[(int) maxMonth]) {
                maxMonth = (int) i;
            }
        }
        return maxMonth + 1;
    }

    public long numMonthOfMinSales(long[] sales) {
        int minMonth = 0; // Месяцев Минимальных продаж
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] <= sales[(int) minMonth]) {
                minMonth = (int) i;
            }
        }
        return minMonth + 1;
    }

    public long countMonthOfSalesBelowAverage(long[] sales) {
        int count = 0;
        long averageSum = averageSumOfSales(sales); // Месяцев продаж ниже среднего
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] > averageSum) {
                count++;
            }
        }
        return count;
    }

    public long countMonthOfSalesAboveAverage(long[] sales) {
        int count = 0;
        long averageSum = averageSumOfSales(sales); // Месяцев продаж выше среднего
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] < averageSum) {
                count++;
            }
        }
        return count;
    }
}

