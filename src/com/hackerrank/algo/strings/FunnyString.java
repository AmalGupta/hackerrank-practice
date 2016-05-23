/**
 * 
 */
package com.hackerrank.algo.strings;

import java.util.Scanner;

/**
 * @author agupt316
 *
 */
public class FunnyString {

	public static String checkFunny(String str){
		StringBuilder rev = new StringBuilder(str).reverse();
		String revStr=rev.toString();
		int fwd=0;
		int revC=0;
		boolean flag = true;
		for(int i=1;i<str.length();i++){
			fwd =Math.abs((int)str.codePointAt(i)-(int)str.codePointAt(i-1));
			revC =Math.abs((int)revStr.codePointAt(i)-(int)revStr.codePointAt(i-1));
			if(fwd!=revC){
				flag=false;
				break;
			}
			
		}
		
		if(flag){
			return "Funny";
		}
		else
		{
			return "Not Funny";
		}
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
			 System.out.println(checkFunny(str));			 
		 }

	}

}
