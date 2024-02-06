package com.xworkz.specifiersmethod.ineritancerunner;

public class RedmiMobile extends Mobile

  {
       public void version()
       {
    	   System.out.println("it has diffrent versions");
       }
       public void unlocking()
       {
    	   System.out.println("mobile unclock");
       }
       public void switchOff()
       {
    	   System.out.println("switchoff mobile");
       }
       @Override
       public void call()
       {
    	   System.out.println("calling");
       }
       @Override
       public void dial()
       {
    	   System.out.println("dialling");
       }
       @Override
       public void text()
       {
    	   System.out.println("texting");
       }
       
}
