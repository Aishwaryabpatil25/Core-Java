package com.xworkz.interfacemetro;

public class MpElectionRulesImpl implements ElectionRules {

	@Override
	public int votingAge() {
		System.out.println("running voting agerules method");
		int age=17;
		return age;
	}

	@Override
	public String votingProcess() {
		System.out.println("running voting process rules method");
		String vp="electronic";
		return vp;
	}

	@Override
	public String pollingPlace() {
		System.out.println("running polling place rules method");
		String pp="mysore";
		return pp;
	}

	@Override
	public boolean campaigning() {
		System.out.println("running campaigning rules method");
		boolean c=true;
		return c;
	}

	@Override
	public long voteCounting() {
		System.out.println("running voteCounting rules method");
		long vc=100000l;
		return vc;
	}

}
