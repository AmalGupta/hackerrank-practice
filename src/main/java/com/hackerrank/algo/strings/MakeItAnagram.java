/**
 * 
 */
package com.hackerrank.algo.strings;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author agupt316
 *
 */
public class MakeItAnagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str1 = in.next();
		String str2 = in.next();
		
		System.out.println(countDeletions(str1,str2));
		
	}

	/**
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static int countDeletions(String str1, String str2){
		
		boolean areAnagramsPossible = false;
		HashMap<Character, Integer> mapString1 = new HashMap<>();
		HashMap<Character, Integer> mapString2 = new HashMap<>();
		HashMap<Character,Integer> traversed= new HashMap<>();
		HashMap<Character,Integer> compared = new HashMap<>();
		//Construct Map
		char c;
		for(int i=0;i<str1.length();i++){
			c = str1.charAt(i);
			if(mapString1.containsKey(c))
				{
					mapString1.put(c,mapString1.get(c)+1);
				}
			else
			{
				mapString1.put(c, 1);
			}			
		}
		
		int countOfCommonLetters=0;
		//validate Anagrams
		for(int i=0;i<str2.length();i++){
			c = str2.charAt(i);
			if(mapString1.containsKey(c)){
				areAnagramsPossible = true;			
			}
			//Construct Map
			if(mapString2.containsKey(c)){
				mapString2.put(c,mapString2.get(c)+1);
			}
			else{
				mapString2.put(c, 1);
			}
		}
		
		if(mapString1.size()>mapString2.size()){
			traversed = mapString1;
			compared = mapString2;
		}
		else{
			traversed = mapString2;
			compared = mapString1;
		}		
		//TotalDeletions
		int totalDeletions=calculateTotalDeletions(traversed,compared);

		return totalDeletions;
	}

	private static int calculateTotalDeletions(
			HashMap<Character, Integer> traversed,
			HashMap<Character, Integer> compared) {
		
		int totalDeletions=0;
		
		for(Entry<Character, Integer> e:traversed.entrySet()){
			if(compared.containsKey(e.getKey())){
				totalDeletions += Math.abs(e.getValue()-compared.get(e.getKey()));
				compared.put(e.getKey(), 0);
			}
			else{
				totalDeletions+=e.getValue();
			}
		}
		
		for(Entry<Character, Integer> e: compared.entrySet()){
			totalDeletions +=e.getValue();
		}
		
		return totalDeletions;
	}
	
	
}
