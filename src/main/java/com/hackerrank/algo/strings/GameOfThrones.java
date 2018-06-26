/**
 * 
 */
package com.hackerrank.algo.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author agupt316
 *
 */
public class GameOfThrones {

	
	/**
	 * Checks whether an anagram can be palindrome or not
	 * @param str
	 * @return
	 */
	public static String constructKeys(String str){
		Map<Character, Integer> counterMap = new HashMap<Character, Integer>();
		
		String result ="";
		int countOddKeys=0;
		int countEvenKeys=0;
		
		for(int i=0;i<str.length();i++){
			if(counterMap.containsKey(str.charAt(i))){
					counterMap.put(str.charAt(i), counterMap.get(str.charAt(i))+1);
			}
			else
			{
				counterMap.put(str.charAt(i), 1);
			}			
		}
		
		//Check Palindrome Condition
		int totalKeys = counterMap.size();
		
		for(Map.Entry<Character, Integer> entry: counterMap.entrySet()){
			if(entry.getValue()%2==0)
				countEvenKeys++;
			else
				countOddKeys++; 
		}
				
		return checkPalindromeCondition(totalKeys, countEvenKeys, countOddKeys);
	}
	
	
	public static String checkPalindromeCondition(int totalKeys, int countEvenKeys, int countOddKeys){
		String result = "";
		if(totalKeys==1){
			result="YES";
		}
		else if(totalKeys%2==0){
			if(countOddKeys==0 && countEvenKeys==totalKeys){
				result="YES";
			}
			else if(countEvenKeys>0 && countEvenKeys%2==0 && countOddKeys==0){
				result ="YES";
			}
			else if(countOddKeys==1 && countEvenKeys==(totalKeys-1)){
				result="YES";
			}
			else if(countOddKeys%2==0&&countEvenKeys==0){
				result ="YES";
			}
			else if(countOddKeys>1){
				result="NO";
			}
		}
		else if(totalKeys%2==1){
			if(countEvenKeys==totalKeys){
				result="YES";
			}
			else if(countOddKeys==1&&countEvenKeys==(totalKeys-1)){
				result="YES";
			}
			else if(countOddKeys>1){
				result = "NO";
			}
		}
		else
		{
			result = "NO";
		}
		
		return result;
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str=in.nextLine();		
		System.out.println(constructKeys(str));
	}

}
