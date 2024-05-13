package ru.netology.stats;

public class StatsService {

    public long getAmountSales(long[] sales) {        //Подсчет суммы продаж

        long amount = 0;
        for (int i = 0; i < sales.length; i++) {
            amount = (int) (amount + sales[i]);
        }
        return amount;
    }

    public long getAverageSales(long[] sales) {       //Подсчет средней суммы продаж
        long average = getAmountSales(sales) / 12;

        return average;
    }

    public int getMaxSales(long[] sales) {          //Подсчет номера месяца, в котором был пик продаж
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinSales(long[] sales) {         //Подсчет номера месяца, в котором был минимум продаж
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getMinAverage(long[] sales) {      //Количество месяцев, в которых продажи были ниже среднего
        int countMinAverage = 0;
        long average = getAverageSales(sales);
        for (int i = 0; i < 12; i++) {
            if (sales[i] < average) {
                countMinAverage++;
            }
        }
        return countMinAverage;
    }

    public int getMaxAverage(long[] sales) {      //Количество месяцев, в которых продажи были выше среднего
        int countMaxAverage = 0;
        long average = getAverageSales(sales);
        for (int i = 0; i < 12; i++) {
            if (sales[i] >= average) {
                countMaxAverage++;
            }
        }
        return countMaxAverage;
    }
}

