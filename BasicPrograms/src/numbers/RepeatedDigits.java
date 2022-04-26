package numbers;

import java.util.*;

public class RepeatedDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check");
        int n = sc.nextInt();

        if(hasRepeatedDigit3(n))
            System.out.println(n + " has repeated digits.");
        else
            System.out.println(n + " has not repeated digits.");
    }

//    T(n) : O(nlogn)
    public static boolean hasRepeatedDigit(int n) {
        String num = Integer.toString(n);
        for(int i=0; i<num.length(); i++)
            for(int j=i+1; j<num.length(); j++)
                if(num.charAt(i) == num.charAt(j))
                    return true;
        return false;
    }

    //    T(n): O(1)
    public static boolean hasRepeatedDigit2(int n) {
        char[] arr = Integer.toString(n).toCharArray();
        int[] emptyArr = new int[10];
        Arrays.fill(emptyArr, 0);
        for(int i=0; i<arr.length; i++) {
            int i1 = Integer.parseInt(String.valueOf(arr[i]));
            if( emptyArr[i1] != 0)
                return true;
            else
                emptyArr[i1]++;
        }
        return false;
    }

    //    T(n): O(1)
    public static boolean hasRepeatedDigit3(int n) {
        int[] emptyArr = new int[10];
        Arrays.fill(emptyArr, 0);

        while(n > 0) {
            int lastDigit = n % 10;
            emptyArr[lastDigit]++;
            n /= 10;
        }

        for(int i=0; i<10; i++) {
            if(emptyArr[i] > 1)
                return true;
        }
        return false;
    }


}
