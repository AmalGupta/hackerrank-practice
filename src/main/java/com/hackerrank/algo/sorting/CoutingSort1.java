/**
 * 
 */
package com.hackerrank.algo.sorting;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * https://www.hackerrank.com/challenges/countingsort1
 * @author agupt316
 */
public class CoutingSort1 {

	static void count(int[] ar){
		Map<Integer, Integer> counterMap = new TreeMap<>();
		
		for(Integer i:ar){
			if(counterMap.containsKey(i)){
				counterMap.put(i, counterMap.get(i)+1);
			}
			else{
				counterMap.put(i, 1);
			}
		}
		
		
		Integer[] counterArr = new Integer[100];
		
		for(int i = 0;i<counterArr.length;i++){
			if(counterMap.containsKey(i)){
				counterArr[i]=counterMap.get(i);
			}
			else{
				counterArr[i]=0;
			}
			
		}
		
		for(int i = 0;i<counterArr.length;i++){
			System.out.print(counterArr[i]+" ");
		}
		
		
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
           ar[i]=in.nextInt(); 
        }
        count(ar);
        in.close();

	}

}
