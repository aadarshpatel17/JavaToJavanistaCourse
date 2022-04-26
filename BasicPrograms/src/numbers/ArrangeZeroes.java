package numbers;

import java.util.Arrays;
import java.util.Scanner;

public class ArrangeZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        System.out.println("Enter 0's and 1's");
        int[] arr = new int[size];
        for(int i=0; i<size; i++)
            arr[i] = sc.nextInt();
        arrangeZero(arr);
    }

    public static void arrangeZero(int[] arr) {
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]);
    }
}
