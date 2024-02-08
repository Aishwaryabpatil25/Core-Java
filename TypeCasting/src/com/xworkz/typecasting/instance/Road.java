package com.xworkz.typecasting.instance;

public class Road 
{
    public void runHandwash(Handwash handwash) 
    {
    	handwash.aroma="Rose";
        System.out.println(handwash.aroma);
        handwash.clean();

       
        if (handwash instanceof Sanitizer)
        {
            Sanitizer sanitizer = (Sanitizer) handwash; 
            sanitizer.quantity=500;
            System.out.println(sanitizer.quantity);
            sanitizer.disinfect();
        }
        
        if (handwash instanceof Soap) 
        {
            Soap soap = (Soap) handwash; 
            soap.price=80;
            System.out.println(soap.price);
            soap.foam();
        
            if (soap instanceof Lux) 
            {
            	Lux lux =  (Lux)soap;
            	lux.manufacturer="Unilever";
            	System.out.println(lux.manufacturer);
            	lux.makeYoung();
            }
            
            	
        }
    }
}
