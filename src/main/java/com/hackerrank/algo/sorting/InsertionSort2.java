/**
 * 
 */
package com.hackerrank.algo.sorting;

import java.util.Scanner;

/**
 * @author agupt316
 *
 */
public class InsertionSort2 {

	public static void insertionSortPart2(int[] ar)
    {      
		int temp = ar[ar.length-1];
		int x=0;
		int j=0;
		for(int i=1;i<ar.length-1;i++){
			x=ar[i];
			j=i;
			while(j>0&&ar[j-1]>x){
				ar[j] = ar[j-1];
				j--;
			}
			ar[j]=x;
			printArray(ar);			
		}
	
		insertIntoSorted(ar);
    }  
    
	
	public static void insertIntoSorted(int[] ar) {
	     int temp=0;
	     temp = ar[ar.length-1];
	     
	     if(temp>ar[ar.length-2]){
			 return;
		 }
		 for(int i=ar.length-1;i>=0;i--){			 
			 if(i>0)
			 {
				if (temp < ar[i - 1])
				{
					ar[i] = ar[i - 1];
				} else {
					ar[i] = temp;
					break;
				}
			 }
			 else
			 {
				 if(temp<ar[i]&&temp<ar[i+1]){
					 ar[i]=temp;
					 break;
				 }
			 }
		 }
		 
		 printArray(ar);
	 }
	
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
}
