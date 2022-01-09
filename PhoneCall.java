package com.te.staticanddefault;

public interface PhoneCall {
	void busyMessage();
	default void covidAlert() {
		System.out.println("Amitabh Bachhan is speaking");
	}

}
