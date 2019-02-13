package com.scp.java;

public class SortString {
	public static void main(String[] args) {
		String s1="SdRab342cd";
		char [] c1=s1.toCharArray();
		char temp =0;
		char t='a';
		char t1='b';
		System.out.println(t<t1);
	//	System.out.println("gfr"+temp+"fde");
		for (int i = 0; i < c1.length; i++) {
			for (int j = 0; j < c1.length; j++) {
				if(c1[j]>c1[i]){
					temp=c1[j];
					c1[j]=c1[i];
					c1[i]=temp;
				}
			}
		}
		for (int i = 0; i < c1.length; i++) {
		//	System.out.println(c1[i]);
		}
	
}

}
