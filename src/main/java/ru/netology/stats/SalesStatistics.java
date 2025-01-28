package ru.netology.stats;

public class SalesStatistics {

    public int sumOfSales(int[] sales) {
        long sum = 0; // Общие продажи
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return (int) sum;
    }

    public int averageSumOfSales(int[] sales) {
        long sum = 0;
        long averageSum = 0;  // Средние продажи
        for (long i = 0; i < sales.length; i++) {
            sum += sales[(int) i];
            averageSum = (sum / sales.length);
        }
        return (int) averageSum;
    }


    public int numMonthOfMaxSales(int[] sales) {
        long maxMonth = 0; // Месяцев Максимальных продаж
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] >= sales[(int) maxMonth]) {
                maxMonth = (int) i;
            }
        }
        return (int) (maxMonth + 1);
    }

    public int numMonthOfMinSales(int[] sales) {
        long minMonth = 0; // Месяцев Минимальных продаж
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] <= sales[(int) minMonth]) {
                minMonth = (int) i;
            }
        }
        return (int) (minMonth + 1);
    }

    public int countMonthOfSalesBelowAverage(int[] sales) {
        int count = 0;
        int averageSum = averageSumOfSales(sales); // Месяцев продаж ниже среднего
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] > averageSum) {
                count++;
            }
        }
        return count;
    }

    public int countMonthOfSalesAboveAverage(int[] sales) {
        int count = 0;
        int averageSum = averageSumOfSales(sales); // Месяцев продаж выше среднего
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] < averageSum) {
                count++;
            }
        }
        return count;
    }
}

