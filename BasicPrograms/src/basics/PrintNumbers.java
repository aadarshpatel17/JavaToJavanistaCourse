package basics;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter range: ");
        int range = input.nextInt();
        for(int i=0; i<=100; i++)
            System.out.println(i);
    }
}
