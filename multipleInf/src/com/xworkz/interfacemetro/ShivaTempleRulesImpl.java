package com.xworkz.interfacemetro;

public class ShivaTempleRulesImpl implements TempleRules {

	@Override
	public double openTime() {
		System.out.println("running opentime method in shiva temple");
		double ot=10.00;
		return ot;
	}

	@Override
	public double closeTime() {
		System.out.println("running closetime method in shiva temple");
		double ct=9.35;
		return ct;
	}

	@Override
	public double specialEntry() {
		System.out.println("running special entry method in shiva temple");
		double fee=200;
		return fee;
	}

}
