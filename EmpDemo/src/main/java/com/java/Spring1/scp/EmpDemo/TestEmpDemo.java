package com.java.Spring1.scp.EmpDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmpDemo {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
		Emp1 emp1=(Emp1) context.getBean("emp");
		Emp1 emp2=(Emp1) context.getBean("emp"); 
		System.out.println(emp1==emp2);
		System.out.println(emp1.equals(emp2));
		
		Address a1=emp1.getAddress();
		Address a2=emp2.getAddress();
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
		Address ad1=(Address)context.getBean("ads");
		Address ad2=(Address)context.getBean("ads");
		System.out.println(ad1==ad2);
		System.out.println(ad1.equals(ad2));
		
		System.out.println(emp1);
	/*	System.out.println(ad1);
		System.out.println(emp1.getAddress());*/
		/*1st go throught the default constractor than setter set the values in setter type
		 * to DI using constuctor than parametrrised constructor complulsory
		 * 2 way to get composite value Address ad1=(Address)context.getBean("ads"); or  emp1.getAddress()
		 * if we r taken emp1 singleton and address as a prototype tha creting object using emp2.getAddress(); than it will create
		 * one object with same reference but we r creating object with context.getBean("ads"); thn it will creat different object
		 * to solve this problem using looupmethod
		 * 
		*/
	}

}
