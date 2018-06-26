/**
 * 
 */
package com.hackerrank.algo.strings;

import java.util.Scanner;

/**
 * @author agupt316
 *
 */
public class AlternatingChars {
	
	public static int countDels(String str){
		int countDel=0;
		for(int i=1;i<str.length();i++){
			
			if(str.codePointAt(i)==str.codePointAt(i-1)){
				countDel++;
			}			
		}
		
		return countDel;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 int count;
		 String str="";
		 count = in.nextInt();
		 
		 for(int i=0;i<count;i++){
			 str=in.next();
			 System.out.println(countDels(str));			 
		 }

	}

}
