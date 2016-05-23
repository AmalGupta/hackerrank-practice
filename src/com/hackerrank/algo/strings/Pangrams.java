package com.hackerrank.algo.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pangrams {

	public static String checkPangrams(String str) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		str=str.toUpperCase();
				
		for (int i = 0; i < str.length(); i++) {
				map.put(str.codePointAt(i), 1);
		}
		
		if(map.containsKey(32)){
			map.remove(32);
		}
		
		if (map.size() >= 26) {
			return "pangram";
		} else {
			return "not pangram";
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = "";
		str = in.nextLine();
		System.out.println(checkPangrams(str));
	}
}
