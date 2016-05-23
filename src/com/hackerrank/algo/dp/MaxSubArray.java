/**
 * 
 */
package com.hackerrank.algo.dp;

import java.util.Scanner;

/**
 * @author agupt316
 *
 */
public class MaxSubArray {

	
	public static int max(int x, int y){
		return (x>y)?x:y;
	}
	
	public static int[] maxSubArray(int[] arr, int dim) {
		int maxNonConti = 0;
		int maxSoFar = 0;
		int currMax= 0;
		int[] result = new int[2];
		boolean areAllNegative = false; 
		
		//check whether all are negative
		for(int i=0;i<dim;i++){
			if(arr[i]<0)
			{
				areAllNegative=true;
			}
			else
			{
				areAllNegative=false;
				break; 
			}
		}
		
		if(areAllNegative){
			maxSoFar = arr[0];
			maxNonConti =arr[0];
			for(int i=0;i<dim;i++)
			{
				maxSoFar = max(maxSoFar,arr[i]);
				maxNonConti = maxSoFar;
			}
			result[0]=maxSoFar;
			result[1]=maxNonConti;
			return result;		
		}
		
		
		for(int i=0; i<dim; i++){
			if(arr[i]>0)
			{
				maxNonConti = max(maxNonConti, maxNonConti+arr[i]);
			}
			currMax = max(arr[i], currMax+arr[i]);
			maxSoFar = max(maxSoFar, currMax);
		}
		result[0]=maxSoFar;
		result[1]=maxNonConti;
		return result;
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int noOfCases = in.nextInt();
		int dim;
		int[] arr;
		for(int i=0; i<noOfCases;i++){
			dim=in.nextInt();
			arr=new int[dim];
			for(int j=0;j<dim;j++){
				arr[j]=in.nextInt();
			}
			
			int[] result = maxSubArray(arr, dim); 
			System.out.println(result[0]+" "+result[1]);
		}
	}

}
