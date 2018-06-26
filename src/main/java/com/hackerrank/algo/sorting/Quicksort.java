/**
 * 
 */
package com.hackerrank.algo.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/quicksort2
 * @author agupt316
 *
 */
public class Quicksort {
	
	 static List<Integer> partition(List<Integer> ar) {
		   List<Integer> left = new LinkedList<>();
		   List<Integer> right = new LinkedList<>();
		   List<Integer> equal = new LinkedList<>();
	       
		   List<Integer> leftMerged = new LinkedList<>();
		   List<Integer> rightMerged = new LinkedList<>();
		   List<Integer> finalMergedList = new LinkedList<>();
		   LinkedList<Integer> finalList = new LinkedList<>();
		   
		   int pivot;
	       if(ar.size()>0){
	    	   pivot = ar.get(0);
	       	   for(int n:ar){
	       		    if(n>pivot)  {
	       		    	right.add(n);	       		    	 	
	       		    }
	       		    else if(n==pivot){
	       		    	equal.add(n);
	       		    	}
	       		    else{
	       		    		left.add(n);
	       		    	}
	       		    }    	   
	       }
	       
	       
	       if(left.isEmpty()||left.size()==1){
	   		  if(right.isEmpty()||right.size()==1){
	   			  //Merge Arrays
	   			 finalList.addAll(left);
	   			 finalList.addAll(equal);
	   			 finalList.addAll(right);
	   			 if(finalList.size()>1)
	   				 printArray(finalList);
	   			 return finalList;
	    	  }
	       }
	       
	       if(left.size()>0){
	       	  leftMerged=partition(left);
	       }
	       
	       if(right.size()>0){
		 		   rightMerged=partition(right);	   	   
	       }
	       
	       
	       
	       finalMergedList.addAll(leftMerged);
	       finalMergedList.addAll(equal);
	       finalMergedList.addAll(rightMerged);	       
	      
	       if(finalMergedList.size()>1)
	    	   printArray(finalMergedList);
	       return finalMergedList;
	       
	     }
	 
	 static void quickSort(int[] ar) {
		 Integer[] arr = new Integer[ar.length];
		 for(int i=0;i<arr.length;i++){
			 arr[i] = ar[i];			 
		 }
		 List<Integer> unsorted = new ArrayList<Integer>();
		 unsorted = Arrays.asList(arr);
		 List<Integer> sorted= new ArrayList<Integer>(); 
		sorted= partition(unsorted);
		 
     } 
	 
	 static void printArray(List<Integer> ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           quickSort(ar);
           in.close();
       }  

}
