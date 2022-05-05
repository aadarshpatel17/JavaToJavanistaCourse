package leetcode.april2020;

import java.util.Scanner;

/*
You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

        On each day, you may decide to buy and/or sell the stock. You can only hold at most one share
        of the stock at any time. However, you can buy it then immediately sell it on the same day.

        Find and return the maximum profit you can achieve.

        Input: prices = [7,1,5,3,6,4]
        Output: 7
        Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
        Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
        Total profit is 4 + 3 = 7.
*/


public class BuySellStockII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String str = "[7,1,5,3,6,4]"; // 7
//        String str = "[1,2,3,4,5]";   // 4
//        String str = "[7,6,4,3,1]";   // 0
//        String str = "[6,1,3,2,4,7]";   // 7
//        String str = "[2,1,4,5,2,9,7]";   // 11

        String str = sc.next();
        String[] string = str.replaceAll("\\[", "")
                .replaceAll("]", "")
                .split(",");
        int[] arr = new int[string.length];
        for (int i = 0; i < string.length; i++)
            arr[i] = Integer.valueOf(string[i]);

//        System.out.println(maxProfit(arr));
        System.out.println(maxProfitEfficient(arr));
    }


//    Efficient: O(n)
    public static int maxProfitEfficient(int[] prices) {
        int maxProfit = 0;
        for(int i=1; i<prices.length; i++) {
            if(prices[i-1] < prices[i])
                maxProfit += (prices[i] - prices[i-1]);
        }
        return maxProfit;
    }

    //    brute-force O(n^2);
    public static int maxProfit(int[] prices) {
        int buy = 0, sell = 0, maxProfit = 0;

        for(int i=0; i<prices.length-1; i++) {
            int j = i+1;
            boolean flag = true;
            int profit = 0;
            while(j < prices.length) {
                int temp = prices[j-1];
                if(flag && prices[i] > prices[j])
                    break;
                else if(!flag && temp < prices[j]) {
                    buy = prices[i];
                    sell = prices[j];
                    profit = sell - buy;
                }
                else if(!flag && temp > prices[j])
                    break;
                else if(flag) {
                    buy = prices[i];
                    sell = prices[j];
                    profit = sell - buy;
                    flag = false;
                }
                j++;
            }
            i = j-1;
            maxProfit += profit;
            if(j >= prices.length)
                break;
        }
        return maxProfit;
    }
}
