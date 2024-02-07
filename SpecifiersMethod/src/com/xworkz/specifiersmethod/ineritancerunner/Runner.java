package com.xworkz.specifiersmethod.ineritancerunner;

import com.xworkz.specifiersmethod.inheritance.CanonPrinter;
import com.xworkz.specifiersmethod.inheritance.Printer;
import com.xworkz.specifiersmethod.inheritance.SmartCanonPrinter;

public class Runner
  {

	public static void main(String[] args)
	{
	  
		Printer printer = new Printer();
		
		printer.print();
		printer.scan();
		printer.copy();
		
		System.out.println("________________________________________");
		
	    CanonPrinter canonPrinter =new CanonPrinter();
	    
	    canonPrinter.print();
	    canonPrinter.scan();
	    canonPrinter.copy();
	    canonPrinter.connectToWifi();
	    
	    System.out.println("________________________________________");
	    
	    Printer printer1 = new CanonPrinter();
		
	    printer.print();
		printer.scan();
		printer.copy();
		
	    System.out.println("________________________________________");
	    
	    CanonPrinter canonPrinter1 = (CanonPrinter)printer1;
	    
	    canonPrinter1.print();
	    canonPrinter1.scan();
	    canonPrinter1.copy();
	    canonPrinter1.connectToWifi();
	    
	    System.out.println("________________________________________");
	    
	    SmartCanonPrinter smartCanonPrinter = new SmartCanonPrinter();
	    
	    smartCanonPrinter.print();
	    smartCanonPrinter.scan();
	    smartCanonPrinter.copy();
	    smartCanonPrinter.connectToWifi();
	    smartCanonPrinter.connectToMobile();
	    
	    System.out.println("________________________________________");
	    
	    CanonPrinter canonPrinter2 = new SmartCanonPrinter();
	    
	    canonPrinter.print();
	    canonPrinter.scan();
	    canonPrinter.copy();
	    canonPrinter.connectToWifi();
	    
	    System.out.println("________________________________________");
	    
	    SmartCanonPrinter smartCanonPrinter1 = (SmartCanonPrinter)canonPrinter2;
	    
	    smartCanonPrinter1.print();
	    smartCanonPrinter1.scan();
	    smartCanonPrinter1.copy();
	    smartCanonPrinter1.connectToWifi();
	    smartCanonPrinter1.connectToMobile();
	    
	    Printer printer2 = new SmartCanonPrinter();
	    
	    printer2.print();
	    printer2.scan();
	    printer2.copy();
	    
	    SmartCanonPrinter smartCanonPrinter2 = (SmartCanonPrinter)printer2;
	    
	    smartCanonPrinter2.print();
	    smartCanonPrinter2.scan();
	    smartCanonPrinter2.copy();
	    smartCanonPrinter2.connectToWifi();
	    smartCanonPrinter2.connectToMobile();
	   
	    
	
	}
}
