/**
 * 
 */
package com.hackerrank.algo.strings;

import java.util.Scanner;

/**
 * @author amagupta
 *
 */
public class ReducedString {

	/**
	 * @param args
	 * https://www.hackerrank.com/challenges/reduced-string
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String text = scanner.next();
		reduceString(text);
	}
	
	
	public static void reduceString(String text){
		if(text.isEmpty()){
			System.out.println("Empty String");
		}
		
		char[] modifiedString = new char[text.length()];
		char[] currentString = text.toCharArray();
		for(int i=0,j=0; i<currentString.length;i++){
			if((i<currentString.length-1)&&(currentString[i]==currentString[i+1])){
				i+=1;
				continue;
			}
			modifiedString[j] = currentString[i];
			j++;
		}
		
		String mod = new String(modifiedString);
		
		if(mod.equals(text)){
			System.out.println(mod.trim());
		}
		else{
			reduceString(mod.trim());
		}
	}

}
