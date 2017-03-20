package BestTimetoBuyandSellStockII;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit. You may complete as many transactions 
 * as you like (ie, buy one and sell one share of the stock multiple times). However, you 
 * may not engage in multiple transactions at the same time (ie, you must sell the stock 
 * before you buy again).
 * @author Mengyi
 *
 */

public class BestTimetoBuyandSellStockII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] prices = {1,26,4,5,100,1,25,27,26,200};
		maxProfit(prices);
		System.out.print(maxProfit(prices));
	}
	
	public static int maxProfit(int[] prices) {
		
		
//		int total = 0;
//	    for (int i=0; i< prices.length-1; i++) {
//	        if (prices[i+1]>prices[i]) total += prices[i+1]-prices[i];
//	    }
//	    
//	    return total;
		
		int profit = 0;
        
		Queue<Integer> queue = new LinkedList<Integer>();
        for(int i = 1; i < prices.length; i++){
        	if(prices[i-1] < prices[i]){
        		queue.add(prices[i-1]);
        	}
    		if(queue.size() != 0) {
    			profit += prices[i]-queue.remove();
    		}
    		queue.clear();
        }
        
        return profit;
    }

}
