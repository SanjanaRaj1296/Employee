package com.te.singleton;

public class Whatsapp {

	 static Whatsapp app;

	private Whatsapp() {
		System.out.println("Singleton");

	}
	static Whatsapp method() {
		
		if(app==null) {
			  app=new Whatsapp();
			return app;
		}
		return app;
		}
	}


