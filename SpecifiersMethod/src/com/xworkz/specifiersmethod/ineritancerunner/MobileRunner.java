package com.xworkz.specifiersmethod.ineritancerunner;

import com.xworkz.specifiersmethod.inheritance.Mobile;
import com.xworkz.specifiersmethod.inheritance.RedmiMobile;
import com.xworkz.specifiersmethod.inheritance.SmartPhone;
import com.xworkz.specifiersmethod.inheritance.TouchScreenRedmiMobile;

public class MobileRunner
  {

	  public static void main(String[] args) {
		
		  Mobile mobile = new Mobile();
		  
		  mobile.call();
		  mobile.dial();
		  mobile.text();
		  
		  System.out.println("__________________________________");
		  
		  RedmiMobile redmiMobile = new RedmiMobile();
		 
		  redmiMobile.call();
		  redmiMobile.dial();
		  redmiMobile.text();
		  redmiMobile.version();
		  redmiMobile.unlocking();
		  redmiMobile.switchOff();
		  
		  System.out.println("__________________________________");
		  
		  Mobile mobile1 = new RedmiMobile();
		 
		  mobile1.call();
		  mobile1.dial();
		  mobile1.text();
		 
		 System.out.println("__________________________________");
		 
		  RedmiMobile redmiMobile1 = (RedmiMobile)mobile1;
		  
		  redmiMobile1.call();
		  redmiMobile1.dial();
		  redmiMobile1.text();
		  redmiMobile1.version();
		  redmiMobile1.unlocking();
		  redmiMobile1.switchOff();
		  
		  System.out.println("__________________________________");
	
		   TouchScreenRedmiMobile  touchScreenRedmiMobile = new  TouchScreenRedmiMobile ();
		 
		   touchScreenRedmiMobile.call();
		   touchScreenRedmiMobile.dial();
		   touchScreenRedmiMobile.text();
		   touchScreenRedmiMobile.version();
		   touchScreenRedmiMobile.unlocking();
		   touchScreenRedmiMobile.switchOff();
		   touchScreenRedmiMobile.clean();
		   touchScreenRedmiMobile.reset();
		   touchScreenRedmiMobile.screenProtector();
		   
		   System.out.println("__________________________________");
		   
		   RedmiMobile redmiMobile2 = new TouchScreenRedmiMobile();
		   
		   redmiMobile2 .call();
		   redmiMobile2 .dial();
		   redmiMobile2 .text();
		   redmiMobile2 .version();
		   redmiMobile2 .unlocking();
		   redmiMobile2 .switchOff();
		   
		   System.out.println("__________________________________");
		   
		   TouchScreenRedmiMobile touchScreenRedmiMobile1 =(TouchScreenRedmiMobile)redmiMobile2;
		   
		   touchScreenRedmiMobile1.call();
		   touchScreenRedmiMobile1.dial();
		   touchScreenRedmiMobile1.text();
		   touchScreenRedmiMobile1.version();
		   touchScreenRedmiMobile1.unlocking();
		   touchScreenRedmiMobile1.switchOff();
		   touchScreenRedmiMobile1.clean();
		   touchScreenRedmiMobile1.reset();
		   touchScreenRedmiMobile1.screenProtector();
		   
		   
		   System.out.println("__________________________________");
		   
		   Mobile mobile2 = new TouchScreenRedmiMobile();
		   
		   mobile2.call();
		   mobile2.dial();
		   mobile2.text();
		   
		   
		   System.out.println("__________________________________");
		   
		   TouchScreenRedmiMobile  touchScreenRedmiMobile2=(TouchScreenRedmiMobile)mobile2;
		   
		   touchScreenRedmiMobile2 .call();
		   touchScreenRedmiMobile2.dial();
		   touchScreenRedmiMobile2.text();
		   touchScreenRedmiMobile2.version();
		   touchScreenRedmiMobile2.unlocking();
		   touchScreenRedmiMobile2.switchOff();
		   touchScreenRedmiMobile2.clean();
		   touchScreenRedmiMobile2.reset();
		   touchScreenRedmiMobile2.screenProtector();
		   
		   
		   System.out.println("__________________________________");
		   
		   SmartPhone smartPhone = new SmartPhone();
		   
		   smartPhone.fastCharging();
		   smartPhone.refresh();
		   smartPhone.tourchOn();
		   
		   System.out.println("__________________________________");
		   
		   TouchScreenRedmiMobile  touchScreenRedmiMobile3 = new SmartPhone();
		   
		   touchScreenRedmiMobile3.call();
		   touchScreenRedmiMobile3.dial();
		   touchScreenRedmiMobile3.text();
		   touchScreenRedmiMobile3.version();
		   touchScreenRedmiMobile3.unlocking();
		   touchScreenRedmiMobile3.switchOff();
		   touchScreenRedmiMobile3.clean();
		   touchScreenRedmiMobile3.reset();
		   touchScreenRedmiMobile3.screenProtector();
		   
		   System.out.println("__________________________________");
		   
		   SmartPhone smartPhone1 =(SmartPhone) touchScreenRedmiMobile2 ;
		   
		   smartPhone1.call();
		   smartPhone1.dial();
		   smartPhone1.text();
		   smartPhone1.version();
		   smartPhone1.unlocking();
		   smartPhone1.switchOff();
		   smartPhone1.clean();
		   smartPhone1.reset();
		   smartPhone1.screenProtector();
		   smartPhone1.fastCharging();
		   smartPhone1.refresh();
		   smartPhone1.tourchOn();
		   
		   System.out.println("__________________________________");
		   
		   RedmiMobile redmiMobile4 = new SmartPhone();
		   
		   redmiMobile4.call();
		   redmiMobile4.dial();
		   redmiMobile4.text();
		   redmiMobile4.version();
		   redmiMobile4.unlocking();
		   redmiMobile4.switchOff();
		 
		   System.out.println("__________________________________");
		   
		   SmartPhone smartPhone3 = (SmartPhone)redmiMobile4;
		 
		   smartPhone3.call();
		   smartPhone3.dial();
		   smartPhone3.text();
		   smartPhone3.version();
		   smartPhone3.unlocking();
		   smartPhone3.switchOff();
		   smartPhone3.clean();
		   smartPhone3.reset();
		   smartPhone3.screenProtector();
		   smartPhone3.fastCharging();
		   smartPhone3.refresh();
		   smartPhone3.tourchOn();
		   
		   System.out.println("__________________________________");
		   
	       Mobile mobile4 = new SmartPhone();
	       
	       mobile4.call();
	       mobile4.dial();
	       mobile4.text();
	      
	       System.out.println("__________________________________");
	       
	       SmartPhone   smartPhone2 =( SmartPhone )mobile4;
		   
	       smartPhone2.call();
	       smartPhone2.dial();
	       smartPhone2.text();
	       smartPhone2.version();
	       smartPhone2.unlocking();
	       smartPhone2.switchOff();
	       smartPhone2.clean();
	       smartPhone2.reset();
	       smartPhone2.screenProtector();
	       smartPhone2.fastCharging();
	       smartPhone2.refresh();
	       smartPhone2.tourchOn();
	      
	  }
	  
}
