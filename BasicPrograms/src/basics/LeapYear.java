package basics;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        System.out.println(isLeapYear(year));
    }

    public static boolean isLeapYear(int year) {
        if(year % 400 == 0)
            return true;
        else if(year % 100 == 0)
            return false;
        else if(year % 4 == 0)
            return true;
        return false;
    }
}
