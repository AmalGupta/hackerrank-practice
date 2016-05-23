/**
 * 
 */
package com.hackerrank.algo.greedy;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author agupt316
 *
 */
public class JimAndTheOrders {

	/**
	 * https://www.hackerrank.com/challenges/jim-and-the-orders
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int noOfOrders = in.nextInt();
		int timestamp=0;
		int duration=0;
		LinkedList<Integer> timeLogger = new LinkedList<Integer>();
 		for(int i = 0;i<noOfOrders;i++){
			timestamp = in.nextInt();
			duration = in.nextInt();
			timeLogger.add(timestamp+duration);
		}		
 		
 		LinkedList<Integer> finalArrangedList = new LinkedList<Integer>(timeLogger);
	 	Collections.sort(finalArrangedList);
	 	int index;
	 	for(Integer e:finalArrangedList){
	 	 	index = timeLogger.indexOf(e);
	 	 	System.out.print(index+1 + " ");
	 	 	timeLogger.removeFirstOccurrence(e);
	 	 	timeLogger.add(index, -1);
	 	}
	}

}
