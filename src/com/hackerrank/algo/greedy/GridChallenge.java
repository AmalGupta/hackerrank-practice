/**
 * 
 */
package com.hackerrank.algo.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/grid-challenge
 * @author agupt316
 *
 */
public class GridChallenge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int noCases = in.nextInt();
		int gridSize =0;
		for(int i=0;i<noCases; i++){
			gridSize = in.nextInt();
			char[][] rows = new char[gridSize][gridSize];
			for(int j=0;j<gridSize;j++){
				rows[j] = in.next().toCharArray();
				Arrays.sort(rows[j]);
			}				
			validate(rows, gridSize);
		}
	}
	
	private static void validate(char[][] rows, int gridSize) {
				
		for(int i=0;i<gridSize-1;i++){
			for(int j=0;j<gridSize;j++){
				if(rows[i+1][j]<rows[i][j]){
					System.out.println("NO");
					return;
				}
			}
		}
		
		System.out.println("YES");
		return;
	}

}
