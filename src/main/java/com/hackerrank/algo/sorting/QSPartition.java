package com.hackerrank.algo.sorting;

import java.util.Scanner;

public class QSPartition {

    static void partition(int[] ar) {
       int[] left=new int[ar.length];
       int[] right = new int[ar.length];
       int[] equal= new int[ar.length];
       int leftCounter =0;
       int rightCounter = 0;
       int pivot;
       if(ar.length>0){
    	   pivot = ar[0];
       	   for(int n:ar){
       		    if(n>pivot)  {
       		    	right[rightCounter++]=n; 	
       		    }
       		    else if(n==pivot){
       		    	equal[0]=n;
       		    	}
       		    else{
       		    		left[leftCounter++]=n;
       		    	}
       		    }    	   
       	   
       }
       int[] finalAr = new int[ar.length];
       //Create Final Array
       for(int i = 0; i<leftCounter;i++){
    		   finalAr[i] = left[i];    	   
       }
       finalAr[leftCounter]=equal[0];
       for(int i = 1; i<=rightCounter;i++){
		   finalAr[leftCounter+i] = right[i-1];    	   
		}
    	
       printArray(finalAr);
      
     }
    

static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }        
   }
    
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
           ar[i]=in.nextInt(); 
        }
        partition(ar);
    }    
}
