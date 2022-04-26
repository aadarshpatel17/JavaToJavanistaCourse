package basics;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter range: ");
        int range = input.nextInt();

        for(int i=1; i<=range; i++)
            if(i % 2 != 0)
                System.out.print(i + " ");
    }
}
