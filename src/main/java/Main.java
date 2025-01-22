import ru.netology.stats.SalesStatistics;

public class Main {
    public static void main(String[] args) {
        SalesStatistics service = new SalesStatistics();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println(service.sumOfSales(sales));
        System.out.println(service.averageSumOfSales(sales));
        System.out.println(service.numMonthOfMaxSales(sales));
        System.out.println(service.numMonthOfMinSales(sales));
        System.out.println(service.countMonthOfSalesBelowAverage(sales));
        System.out.println(service.countMonthOfSalesAboveAverage(sales));

    }
}

