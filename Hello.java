package com.te.staticanddefault;

public class Hello {
	
	public static void main(String[] args) {
		
		PhoneCall c1=new Maharastra();
		PhoneCall c2=new TamilNadu();
		PhoneCall c3=new Karnataka();
		
		c1.busyMessage();
		c2.busyMessage();
		c3.busyMessage();
		
		System.out.println("-------------------");
		
		c1.covidAlert();
		c2.covidAlert();
		c3.covidAlert();
		}
}
