import ru.netology.stats.SalesStatistics;

public class Main {
    public static void main(String[] args) {
        SalesStatistics statistics = new SalesStatistics();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println("Общая сумма продаж: " + statistics.sumOfSales(sales)); // 180
        System.out.println("Средняя сумма продаж: " + statistics.averageSumOfSales(sales)); // 15
        System.out.println("Месяц с максимальными продажами: " + statistics.numMonthOfMaxSales(sales)); // 8
        System.out.println("Месяц с минимальными продажами: " + statistics.numMonthOfMinSales(sales)); // 9
        System.out.println("Количество месяцев с продажами ниже среднего: " + statistics.countMonthOfSalesBelowAverage(sales)); // 5
        System.out.println("Количество месяцев с продажами выше среднего: " + statistics.countMonthOfSalesAboveAverage(sales)); // 5
    }
}
