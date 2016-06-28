/**
 * 
 */
package com.hackerrank.algo.search;

import java.util.Scanner;

/**
 * @author agupt316
 *
 */
public class SherlockAndArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int noOfCases = in.nextInt();
		int dim=0;
		int totalSum=0;
		for(int i=0;i<noOfCases;i++){
			dim=in.nextInt();
			int[] ar = new int[dim];
			for(int j=0;j<dim;j++){
				ar[j] = in.nextInt();
				totalSum +=ar[j];
			}		
			System.out.println(validateSumCondition(ar, totalSum));
			totalSum=0;
		}
	}

	private static String validateSumCondition(int[] ar, int totalSum) {
		int sumOfLeft=0;
		int sumOfRight=totalSum;
		for(int i=0;i<ar.length;i++){
			if(sumOfLeft==sumOfRight){
				return "YES";
			}
			else if(ar.length==1){
				return "YES";
			}
			else if(i==0){
				sumOfRight-=ar[i];
			}
			else {
				sumOfLeft+=ar[i-1];
				sumOfRight-=ar[i];
			}
		}
		return "NO";
	}

}
