package com.scp.java;

import java.util.HashMap;

public class NuberOfOccurence {
	public static void main(String[] args) {
		String s1="mynameisnitesh";
				HashMap<Character,Integer> h1=new HashMap<>();
				
				char[] c=s1.toCharArray();
				for (char c1 : c) {
					if(h1.containsKey(c1)) {
						h1.put(c1,h1.get(c1)+1);
					}else {
						h1.put(c1,1);
					}
					
				}
				System.out.println(h1);
	}

}
