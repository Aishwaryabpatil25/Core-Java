package com.xworkz.interfacemetro;

public class CetExamRulesImpl implements ExamRules{

	@Override
	public boolean hallTicket() {
		System.out.println("running hall ticket method");
		boolean ht=false;
		return ht;
	}

	@Override
	public String invigilator() {
		System.out.println("running invigilator method");
		String inv="deepa";
		return inv;
	}

	@Override
	public double duration() {
		System.out.println("running duration method");
		double dur=2.00;
		return dur;
	}

}
