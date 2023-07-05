package com.cg.springioc;


	import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
	
public class Mobile {
	
	public static void main(String[] args) {
		/*//Obj creation for airtel
		Sim s = new Airtel();
		s.calling();
		s.data();
		
		// Obj creation for jio
		Sim s1 = new Jio();
		s1.calling();
		s1.data();*/

		//Method 1
		ApplicationContext a = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Configuration Loaded!");
       /* Airtel obj = (Airtel)a.getBean("airtel");
        obj.calling();
        obj.data();
        
        Jio obj1 = (Jio)a.getBean("jio");
        obj1.calling();
        obj1.data(); */
        
        //Method 2 
        Sim obj = a.getBean("sim",Sim.class);
        obj.calling();
        obj.data();
	}

}
