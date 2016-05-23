/**
 * 
 */
package com.hackerrank.algo.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author agupt316
 *
 */
public class IceCreamParlour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int noOfCases = in.nextInt();
		int m=0;
		int n=0;
		int totalSum=0;
		List<Integer> flavours;
		for(int i=0;i<noOfCases;i++){
			flavours = new ArrayList<Integer>();
			m=in.nextInt();
			n=in.nextInt();
			for(int j=0;j<n;j++){
				flavours.add(in.nextInt());
			}			
			getIndicesForCost(flavours, m);
		}		
	}

	private static void getIndicesForCost(List<Integer> flavours, int m) {
		
		for(int ci:flavours){
			/**
			 * The AND case comes when the list contains one occurance of (m-ci)
			 * and ci=(m-ci). Therefore if the iterator is at index i, then, flavours.contains(m-ci) will 
			 * hold true for index i => line no 47 will set value at index i to -1 and 
			 * finally the result of line 49 will be wrong. 
			 */
			if(flavours.contains(m-ci)&&(flavours.lastIndexOf(m-ci)!=flavours.indexOf(ci))){	
					System.out.print((flavours.indexOf(ci)+1)+" ");
					flavours.set(flavours.indexOf(ci), -1);
					System.out.println(flavours.indexOf(m-ci)+1);
					return;
				}
			}
	}
}
