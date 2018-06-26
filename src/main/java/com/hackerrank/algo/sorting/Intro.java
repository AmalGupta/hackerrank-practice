/**
 * 
 */
package com.hackerrank.algo.sorting;

import java.util.Scanner;

/**
 * @author agupt316
 *
 */
public class Intro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int findNum=0;
		findNum = in.nextInt();
		int arSize=0;
		arSize = in.nextInt();
		Integer[] arr=new Integer[arSize];
		for(int i=0;i<arSize;i++){
			arr[i]=in.nextInt();
		}
		
		for(int i=0;i<arr.length;i++){
			if(findNum==arr[i]){
				System.out.println(i);
				break;
			}
		}
		
	}

}
