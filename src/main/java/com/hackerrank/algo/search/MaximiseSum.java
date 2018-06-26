/**
 * 
 */
package com.hackerrank.algo.search;

import java.util.Scanner;

/**
 * @author agupt316
 *
 */
public class MaximiseSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int noOfCases = in.nextInt();
		int dim; 
		long modulus, maxModuloSum;
		long[] ar;
		for(int i=0;i<noOfCases;i++){
			dim=in.nextInt();
			modulus=in.nextLong();
			ar = new long[dim];
			for(int j=0;j<dim;j++){
				ar[j]=in.nextLong();
			}
			sortAndFindSum(ar,modulus);
			
		}
	}

	
	private static void sortAndFindSum(long[] ar, long modulus) {
		long sumArray=0;
		long maxModulo=0;
		long maxModuloSoFar=0;
		
		for(int i=0;i<ar.length;i++){
			sumArray=0;//reset
			for(int j=i;j<ar.length;j++){						
				sumArray+=ar[j];
				maxModulo=sumArray%modulus;
				maxModuloSoFar=(maxModuloSoFar>=maxModulo)?maxModuloSoFar:maxModulo;
			}
		}
		System.out.println(maxModuloSoFar);		
	}

}
