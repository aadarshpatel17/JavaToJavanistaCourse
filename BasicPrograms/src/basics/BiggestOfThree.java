package basics;

import java.util.Scanner;

public class BiggestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 number to compare: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        System.out.println(compareNumber(a, b, c));
    }

    public static int compareNumber(int a, int b, int c) {
        if(a > b && a > c)
            return a;
        else if(b > a && b > c)
            return b;
        return c;
    }
}
