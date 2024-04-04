package com.xworkz.interfacemetroadmin;

import com.xworkz.interfacemetro.ExamRules;

public class ExamAdmin {

	private ExamRules examRules;
	
	public ExamAdmin(ExamRules examRules)
	{
		this.examRules=examRules;
	}
	public void hallTicket()
	{
		if(examRules!=null)
		{
			boolean ht= examRules.hallTicket();
			System.out.println("hall ticket:"+ht);
		}
		else
		{
			System.out.println("hall ticket is not found");
		}
	}
	public void invigilator()
	{
		if(examRules!=null)
		{
			String inv=examRules.invigilator();
			System.out.println("invigilator:"+inv);
		}
		else
		{
			System.out.println("invigilator not found");
		}
	}
	public void duration()
	{
		if(examRules!=null)
		{
			double dur=examRules.duration();
			System.out.println("duration:"+dur);
		}
	}
}
