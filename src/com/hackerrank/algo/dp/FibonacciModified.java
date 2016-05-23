/**
 * 
 */
package com.hackerrank.algo.dp;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author agupt316
 *
 */
public class FibonacciModified {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long t0 = in.nextLong();
		long t1 = in.nextLong();
		int n = in.nextInt();		
		System.out.println(nthFibonacciNumber(t0,t1,n).toString());
	}

	private static BigInteger nthFibonacciNumber(long t0, long t1, int n) {
		
		HashMap<Integer,BigInteger> fiboMap = new HashMap<>();
		fiboMap.put(1, BigInteger.valueOf(t0));
		fiboMap.put(2, BigInteger.valueOf(t1));
		int counter=2;
		BigInteger val=new BigInteger("0"); 
		
		while(counter<=n){
			val =fiboMap.get(counter-1).add(fiboMap.get(counter).multiply(fiboMap.get(counter)));
			fiboMap.put(++counter, val);			
		}
				
		return fiboMap.get(counter-1);
	}

}
