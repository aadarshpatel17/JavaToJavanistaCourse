package basics;

import java.util.Scanner;

public class DayConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int days = input.nextInt();
        countDay(days);
    }

    public static void countDay(int days) {
        int years = days / 365;
        int weeks = (days % 365) / 7;
        int day = (days % 365) % 7;
        System.out.println(years + " years, " + weeks + " weeks and " + day + " days");
    }
}
