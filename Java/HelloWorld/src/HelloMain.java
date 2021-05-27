import java.util.ArrayList;
import java.util.List;

import ResourceEngineers.Person;
import computer.*;
import packagephones.Nokia;
import packagephones.Samsung;

public class HelloMain {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
      
        /*  Bike bike1 = new Bike("MyLong");
        Bike bike2 = new Bike("Short","2004","LPG",300);
        System.out.println(bike1);
        System.out.println(bike2);
        
        
        Laptop lap1 = new Laptop();
        System.out.println(lap1);
        
        Person SRKRaju = new Person();
        System.out.println(SRKRaju);
        
        
        //Phone nokia3310 = new Nokia("Nokia_3310");
        Phone nokia3310 = new HelloMain().phone(1);
        //System.out.println(nokia3310.getModel());
        //nokia3310.features();
        
        
        Phone phone = new Phone ("Nokia 3310");
        //System.out.println("Model=" + phone.getModel());
        //phone.features();
        
        Samsung note8 = new Samsung("Note8");
        //note8.features();
        
        Phone note8_1 = new Samsung("Note8_1");
        //System.out.println("Model=" +note8_1.getModel());
        //note8_1.features();
        
        List<Phone> phones = new ArrayList<>();
        phones.add(nokia3310);
        phones.add(note8);
        phones.add(note8_1);
        listPhones(phones);*/
        
        
       // Phone phone = new OnePlus5();
        Phone phone = new iPhone();
        System.out.println("Processor: " + phone.processor());
        
    }
    
    
    
    
    
    /*public static void listPhones(List<Phone> Phones) {
    	for (Phone phone:Phones) {
    		System.out.println(phone.getModel());
    	}
    }
    public Phone phone(int dailyDriver) {
    	switch (dailyDriver) {
    	
    	case 1 : return new Nokia ("3310");
    	case 2 : return new Samsung ("note5");
    	
    	}
		return null;
    }*/
}
