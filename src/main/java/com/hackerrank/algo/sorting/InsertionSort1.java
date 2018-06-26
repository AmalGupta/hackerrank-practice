/**
 * 
 */
package com.hackerrank.algo.sorting;

import java.util.Scanner;

/**
 * @author agupt316
 *
 */
public class InsertionSort1 {

	 public static void insertIntoSorted(int[] ar) {
	     int temp=0;
	     temp = ar[ar.length-1];
	     
	     if(temp>ar[ar.length-2]){
			 printArray(ar);
			 return;
		 }
		 for(int i=ar.length-1;i>=0;i--){			 
			 if(i>0)
			 {
				if (temp < ar[i - 1])
				{
					ar[i] = ar[i - 1];
					printArray(ar);
				} else {
					ar[i] = temp;
					printArray(ar);
					break;
				}
			 }
			 else
			 {
				 if(temp<ar[i]&&temp<ar[i+1]){
					 ar[i]=temp;
					 printArray(ar);
					 break;
				 }
			 }
		 }
		 
	 }
	    
	    
	/* Tail starts here */
	     public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int s = in.nextInt();
	        int[] ar = new int[s];
	         for(int i=0;i<s;i++){
	            ar[i]=in.nextInt(); 
	         }
	         insertIntoSorted(ar);
	    }
	    
	    
	    private static void printArray(int[] ar) {
	      for(int n: ar){
	         System.out.print(n+" ");
	      }
	        System.out.println("");
	   }
	    

}
