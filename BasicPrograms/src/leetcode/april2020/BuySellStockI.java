package leetcode.april2020;

/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
        You want to maximize your profit by choosing a single day to buy one stock and choosing a different
        day in the future to sell that stock.
        Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

        Input: prices = [7,1,5,3,6,4]
        Output: 5
        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
*/

import java.util.Scanner;

public class BuySellStockI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String[] string = str.replaceAll("\\[", "")
                .replaceAll("]", "")
                .split(",");
        int[] arr = new int[string.length];
        for (int i = 0; i < string.length; i++)
            arr[i] = Integer.valueOf(string[i]);

        System.out.println(maxProfitEfficient(arr));
    }

//    O(n);
    public static int maxProfitEfficient(int[] prices) {
        int maxProfit = 0;
        int minSoFar = prices[0];
        for(int i=1; i<prices.length; i++) {
            minSoFar = Math.min(minSoFar, prices[i]);
            int profit = prices[i] - minSoFar;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }

//    brute-force O(n);
    public static int maxProfit(int[] prices) {
        int maxProfit =0, buy = prices[0], sell = 0, buyDate = 0;
        for(int i=1; i<prices.length; i++) {
            int profit = 0;
            if(buy > prices[i]) {
                buy = prices[i];
                buyDate = i;
            }
            if(prices[i] > buy && buyDate < i) {
                sell = prices[i];
                profit = sell - buy;
            }
            if(maxProfit < profit)
                maxProfit = profit;
        }
        return maxProfit;
    }
}
