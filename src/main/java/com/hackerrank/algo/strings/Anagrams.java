/**
 * 
 */
package com.hackerrank.algo.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/anagram
 * @author agupt316
 *
 */
public class Anagrams {

	static void getAnagramConversionCount(String str){
		
		boolean isEvenLength = (str.length()%2==0);
		String firstString;
		String secondString;
		int midIndex;
		int totalCount=0;
		char c;
		Map<Character,Integer> statMap = new HashMap<Character,Integer>();
		
		if(isEvenLength){
			midIndex = str.length()/2;
			firstString=str.substring(0, midIndex);
			secondString=str.substring(midIndex, str.length());
			//Construct
			for(int i=0;i<firstString.length();i++){
				c = firstString.charAt(i);
				if(statMap.containsKey(c)){
					statMap.put(c, statMap.get(c)+1);
				}
				else
				{
					statMap.put(c, 1);
				}
			}			
			//Calculate
			for(int j=0;j<secondString.length();j++){
				c=secondString.charAt(j);
				if(statMap.containsKey(c)){
					statMap.put(c, statMap.get(c)-1);
				}				
			}
		}
		else{
			totalCount=-1;
		}
		
		
		
		for(Entry<Character,Integer> e:statMap.entrySet()){
			if((int)e.getValue()>=0){
				totalCount+=(int)e.getValue();
			}
		}
		
		System.out.println(totalCount);
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	    int noCases = in.nextInt();
	    String str;
	    List<String> cases = new ArrayList<>();
	    for(int i=0;i<noCases;i++){
	    	str = in.next();
	    	cases.add(str);	    	
	    }
	    
	    for(String s:cases){
	    	 getAnagramConversionCount(s);
	    }
	   
	    in.close();
	}

}
