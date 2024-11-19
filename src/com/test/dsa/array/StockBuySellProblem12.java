package com.test.dsa.array;

/* Given an array , The cost of a stock on each day is given in an array. Find the maximum profit that you 
 * can make by buying and selling on those days. If the given array of prices is sorted in decreasing order, 
 * then profit cannot be earned at all.
 * 
 * I/P a={100, 180, 260, 310, 40, 535, 695}
 * O/P :  865
 * Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210
                Buy the stock on day 4 and sell it on day 6 => 695 – 40 = 655
                Maximum Profit  = 210 + 655 = 865

 * I/P arr[] =  {4, 2, 2, 2, 4}
 * O/P: 2
 * Explanation: Buy the stock on day 1 and sell it on day 4 => 4 – 2 = 2
                Maximum Profit  = 2
 * */

public class StockBuySellProblem12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[]={2, 3, 10, 6, 4, 8, 1}; 
		int a[]= {100, 180, 260, 310, 40, 535, 695};
		int d=2;
		System.out.println("Original array");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();


		System.out.println("Maxx difference _ Method1");
		MaxDiff_Method1(a);

		int a1[]={2, 3, 10, 6, 4, 8, 1,2};  

		System.out.println("Maxx difference _ Method2");
		MaxDiff_Method2(a1);

	}

	/*Naive Approach: A simple approach is to try buying the stocks and selling them every single day when
	 *  profitable and keep updating the maximum profit so far.
	 *  
	 *  Follow the steps below to solve the problem:
	 *  Try to buy every stock from start to end – 1
	 *  After that again call the maxProfit function to calculate answer
	 *  curr_profit = price[j] – price[i] + maxProfit(start, i – 1) + maxProfit(j + 1, end)
	 *  profit = max(profit, curr_profit)
*/
	//O(n*n) time and O(1) space
	public static void MaxDiff_Method1(int arr[]) {
		int maxDiff=Integer.MIN_VALUE ;
		// int maxDiff=arr[1]-arr[0] ;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i] ) {
					maxDiff=maxDiff+arr[i];
				}
				maxDiff=Math.max(maxDiff, arr[j]-arr[i]);
			}
		}

		System.out.println(maxDiff);
	}
	//O(n*n) time and O(1) space
	public static void MaxDiff_Method2(int arr[]) {
		int maxDiff=Integer.MIN_VALUE ;
		// int maxDiff=arr[1]-arr[0] ;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				maxDiff=Math.max(maxDiff, arr[j]-arr[i]);
			}
		}

		System.out.println(maxDiff);
	}

}
