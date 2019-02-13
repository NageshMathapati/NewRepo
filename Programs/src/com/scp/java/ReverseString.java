package com.scp.java;

public class ReverseString {
	public static void main(String[] args) {
		String s1="nitesh nagesh nesari";
		vehicle v1=new car();
		bike b=(bike)v1;// ClassCastexception at run time
		b.m1();
		v1.m1();
		
		
		/*char[] c1=s1.toCharArray();
		int j=c1.length-1;
		char[] c3 =new char[j+1];
		//System.out.println(j);
		for (int i = 0; i < c1.length; i++) {
		c3[j]=c1[i];
		j--;
		}
		System.out.println(c3);*/
		String[] c4=s1.split(" ");
		StringBuffer b1=new StringBuffer();
		
		
		for (String s2 : c4) {
			String reverse=new StringBuffer(s2).reverse().toString();
			b1.append(reverse);
			b1.append(" ");
		}
		System.out.println(b1);
	}

}
class vehicle{
	public void m1() {
		System.out.println("vehicle");
	}
}
class bike extends vehicle{
	public void m1() {
		System.out.println("bike");
	}
}
class car extends vehicle{
	public void m1() {
		System.out.println("car");
	}
}
