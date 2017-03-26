package BestTimetoBuyandSellStock;

import java.util.Stack;

/**
 * Description of the question
 * 
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction (ie, buy one and sell one 
 * share of the stock), design an algorithm to find the maximum profit.
 * 
 * Example 1: 
 * Input: [7, 1, 5, 3, 6, 4]
 * Output: 5
 * 
 * max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
 * 
 * Example 2:
 * Input: [7, 6, 4, 3, 1]
 * Output: 0
 * In this case, no transaction is done, i.e. max profit = 0.
 * 
 * @author Mengyi
 * 
 * Solution Kadane's Algorithm
 *
 */

public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] prices = {7, 1, 5, 3, 6, 4};
		maxProfit(prices);
	}
	
	public static int maxProfit(int[] prices) {
        int cur = 0, max = 0;
        for(int i = 1; i < prices.length; i++){
            cur += prices[i]-prices[i-1];
            cur  = Math.max(0, cur); 
            max = Math.max(cur, max);
        }
        
        return max;
    }
}

