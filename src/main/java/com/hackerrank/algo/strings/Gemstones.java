/**
 * 
 */
package com.hackerrank.algo.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 * @author agupt316
 *
 */
public class Gemstones {

	
	private static int countGemElements(List<String> ar) {
		HashSet<Character> trueValues = new HashSet<Character>();
		HashSet<Character> falseValues = new HashSet<Character>();
		HashSet<Character> validationSet = new HashSet<Character>(); ;
		int i=0;
		for(String str:ar){
			i++;
			for(int j=0;j<str.length();j++){
				if(i==1){
					validationSet.add(str.charAt(j));
				}
				else
				{
					if(validationSet.contains(str.charAt(j))){
						for(Character c:validationSet){
							if(str.indexOf(c.toString())>-1){
								trueValues.add(str.charAt(j));
							}
							else{
								falseValues.add(c);
							}
						}
							
					}
					else{
						falseValues.add(str.charAt(j));
					}
				}
			}			
		}
		
		int countOfGemElements = 0;
		
		for(char c:trueValues){
			if(validationSet.contains(c)&&trueValues.contains(c))
			{
				if(!falseValues.contains(c))
					countOfGemElements++;
			}
		}		
		return countOfGemElements;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		List<String> ar= new ArrayList<String>();
		for(int i=0;i<cases;i++){
			ar.add(in.next());
		}
		System.out.println(countGemElements(ar));
	}

}
