package com.te.staticanddefault;

public class TamilNadu implements PhoneCall{
	
	@Override
	public void busyMessage()
	{
		System.out.println("Thodarbal irukrar!!");
	}
	
	@Override
	public void covidAlert()
	{
		System.out.println("Jai TamilNadu");
	}

}


