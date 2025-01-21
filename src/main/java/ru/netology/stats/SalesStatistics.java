package ru.netology.stats;

public class SalesStatistics {

    public int sumOfSales(int[] sales) {
        int sum = 0; // Общие продажи
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int averageSumOfSales(int[] sales) {
        int sum = 0;
        int averageSum = 0;  // Средние продажи
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
            averageSum = (sum / sales.length);
        }
        return averageSum;
    }


    public int numMonthOfMaxSales(int[] sales) {
        int maxMonth = 0; // Максимальные продажи
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int numMonthOfMinSales(int[] sales) {
        int minMonth = 0; // Минимальные продажи
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int countMonthOfSalesBelowAverage(int[] sales) {
        int count = 0;
        int averageSum = averageSumOfSales(sales); // Средние продажи
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSum) {
                count++;
            }
        }
        return count;
    }

    public int countMonthOfSalesAboveAverage(int[] sales) {
        int count = 0;
        int averageSum = averageSumOfSales(sales); // Выше среднего
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSum) {
                count++;
            }
        }
        return count;
    }
}

