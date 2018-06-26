/**
 * 
 */
package com.hackerrank.algo.warmup;

import java.util.Scanner;

/**
 * @author agupt316
 *
 */
public class UtopianTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int totalCases;
		int val;
		totalCases = in.nextInt();
		for(int i=0;i<totalCases;i++)
		{
			val = in.nextInt();
			System.out.println(calcHeight(val));
		}
	}
	
	
	public static int calcHeight(int cycleCount){
		
		/*return (cycleCount!=0)?((cycleCount%2==1)?2*calcHeight(cycleCount-1):calcHeight(cycleCount-1)+1):1;*/
		
		if(cycleCount==0){
			return 1;
		}
		else
		{
			if(cycleCount%2==1){
				return 2*calcHeight(cycleCount-1);
			}
			else
			{
				return calcHeight(cycleCount-1)+1;
			}
		}
	}

}
