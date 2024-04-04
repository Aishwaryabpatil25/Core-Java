package com.xworkz.interfacemetrorunner;

import com.xworkz.interfacemetro.CetExamRulesImpl;
import com.xworkz.interfacemetro.ExamRules;

import com.xworkz.interfacemetroadmin.ExamAdmin;

public class ExamRunner 
   {
	public static void main(String[] args) 
	{
		ExamRules cter=new CetExamRulesImpl();
		cter.hallTicket();
		
		
	   ExamAdmin ea = new ExamAdmin(cter);
	   ea.hallTicket();
	   ea.invigilator();
	   ea.duration();
		
		
	}
}
