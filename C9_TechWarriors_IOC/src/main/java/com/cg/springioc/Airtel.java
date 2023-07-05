package com.cg.springioc;

public class Airtel implements Sim {
	
	Airtel()
	{
		System.out.println("Airtel constructor called");
	}
	
	public void calling() {
		System.out.println("calling using Airtel");
		
	}

	public void data() {
		System.out.println("data using Airtel");
		
	}

}
