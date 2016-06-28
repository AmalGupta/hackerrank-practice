/**
 * 
 */
package com.hackerrank.algo.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/diagonal-difference
 * @author agupt316
 *
 */
public class DiagonalDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int dia1 = 0;
        int dia2 = 0;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
                if(a_j==a_i){ 
                	dia1+=a[a_i][a_j];                
                }
                if(a_j==(n-a_i-1)) {
                	dia2+=a[a_i][a_j];
                }
            }            
        }
        
        System.out.println(Math.abs(dia2-dia1));
    }

}
