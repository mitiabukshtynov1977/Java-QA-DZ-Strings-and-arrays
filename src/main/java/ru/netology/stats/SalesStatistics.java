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
        long maxMonth = 0; // Максимальные продажи
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] >= sales[(int) maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long numMonthOfMinSales(long[] sales) {
        long minMonth = 0; // Минимальные продажи
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] <= sales[(int) minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public long countMonthOfSalesBelowAverage(long[] sales) {
        long count = 0;
        long averageSum = averageSumOfSales(sales); // Средние продажи
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] > averageSum) {
                count++;
            }
        }
        return count;
    }

    public long countMonthOfSalesAboveAverage(long[] sales) {
        long count = 0;
        long averageSum = (int) averageSumOfSales(sales); // Выше среднего
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] < averageSum) {
                count++;
            }
        }
        return count;
    }
}

