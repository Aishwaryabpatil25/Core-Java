package com.xworkz.typecasting.instancerunner;

import com.xworkz.typecasting.instance.Handwash;
import com.xworkz.typecasting.instance.Lux;
import com.xworkz.typecasting.instance.Road;
import com.xworkz.typecasting.instance.Sanitizer;
import com.xworkz.typecasting.instance.Soap;


   public class RoadMaker
   {
    public static void main(String[] args)
	{
		
	Road road = new Road();
	
	Handwash handwash = new Handwash();
	road.runHandwash(handwash);
	
	Handwash handwash1 = new Soap();
	road.runHandwash(handwash1);
	
	Handwash handwash2 = new Sanitizer();
	road.runHandwash(handwash2);
	
	Handwash handwash3 = new Lux();
	road.runHandwash(handwash3);
	
	}
}
