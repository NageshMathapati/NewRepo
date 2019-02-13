package com.scp.java;

public class CountWorldString {
	static String s1="i am nitesh bgft";
	public static void main(String[] args) {
		String[] s2= s1.split(" ");
	//	System.out.println(s2.length);
	//	System.out.println(s1.length());
		int count =1;
		for (int i = 0; i < s1.length()-1; i++) {
			if((s1.charAt(i)==' ')&&(s1.charAt(i+1)!=' ') ) {
				count++;
			}
		}
		System.out.println(count);
	}

}
