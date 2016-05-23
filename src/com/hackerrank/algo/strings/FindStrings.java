/**
 * 
 */
package com.hackerrank.algo.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;

/**
 * @author agupt316
 *
 */
public class FindStrings {
	
	/* Head ends here */
	static void findStrings(String[] a, int[] querry) {

		Set<String> subString = new HashSet<String>();
		Set<String> union = new HashSet<String>();
		//Construct all S
		for(String s:a){
			subString = fetchSubStrings(s);
			union.addAll(subString);
		}
		
		List<String> sortedList= new ArrayList<String>(); 
		sortedList.addAll(union);
		Collections.sort(sortedList);
		
		//Based on query output the values
		for(int i=0;i<querry.length;i++){			
			if(querry[i]<1||querry[i]>sortedList.size()){
				System.out.println("INVALID");
			}
			else{
				System.out.println(sortedList.get(querry[i]-1));  			
			}
			
		}

    }
	
private static Set<String> fetchSubStrings(String s) {
		Set<String> subStrings = new HashSet<String>();
		for(int i=0;i<s.length();i++){
			for(int j=i+1;j<=s.length();j++){
				if(j<=s.length()){
					subStrings.add(s.substring(i, j));
				}
			}
		}
		
		return subStrings;
	}

/* Tail starts here */
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                
        int _cases = Integer.parseInt(in.nextLine());
        String[] _a = new String[_cases];
        
       for(int _a_i = 0; _a_i < _cases; _a_i++) {
            _a[_a_i] = in.nextLine();
        }
        int _query = Integer.parseInt(in.nextLine());
       int[] query = new int[_query];
        for(int _a_i = 0; _a_i < _query; _a_i++) {
            query[_a_i] = Integer.parseInt(in.nextLine());
        }
        
        findStrings(_a,query);
    }
}
