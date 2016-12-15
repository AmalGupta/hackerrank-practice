/**
 * 
 */
package com.hackerrank.algo.strings;

import java.util.Scanner;

/**
 * @author amagupta
 *
 */
public class CamelCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        String s = in.next();
        
        int count=0;
        Character c = Character.MIN_VALUE;
        for(int i=0;i<s.length();i++){
        	c = s.charAt(i);
        	
        	if(Character.isUpperCase(c)){
        		count++;
        	}
        }
                
        System.out.println(count+1);
		
	}

}
