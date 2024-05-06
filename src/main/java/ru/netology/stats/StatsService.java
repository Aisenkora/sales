package ru.netology.stats;

public class StatsService {

    public int getAmountSales(int[] sales) {        //Подсчет суммы продаж
        int amount = sales[0] + sales[1] + sales[2] + sales[3] + sales[4] + sales[5] + sales[6] + sales[7] + sales[8] + sales[9] + sales[10] + sales[11];

        return amount;
    }

    public int getAverageSales(int[] sales) {       //Подсчет средней суммы продаж
        int average = getAmountSales(sales) / 12;

        return average;
    }

    public int getMaxSales(int[] sales) {          //Подсчет номера месяца, в котором был пик продаж
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinSales(int[] sales) {         //Подсчет номера месяца, в котором был минимум продаж
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getMinAverage(int[] sales) {      //Количество месяцев, в которых продажи были ниже среднего
        int countMinAverage = 0;

        for (int i = 0; i < 12; i++) {
            if (sales[i] < getAverageSales(sales)) {
                countMinAverage++;
            }
        }
        return countMinAverage;
    }

    public int getMaxAverage(int[] sales) {      //Количество месяцев, в которых продажи были выше среднего
        int countMaxAverage = 0;

        for (int i = 0; i < 12; i++) {
            if (sales[i] >= getAverageSales(sales)) {
                countMaxAverage++;
            }
        }
        return countMaxAverage;
    }
}

