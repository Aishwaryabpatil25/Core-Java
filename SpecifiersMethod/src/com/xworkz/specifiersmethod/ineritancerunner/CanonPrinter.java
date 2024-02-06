package com.xworkz.specifiersmethod.ineritancerunner;

public class CanonPrinter extends Printer

    {

	public void connectToWifi()
	{
		System.out.println("used to connect to wifi ");
	}

	@Override
	public void print()
	{
		System.out.println("this is printer");
	}
	@Override
	public void scan()
	{
	
		System.out.println("this is scanner");
	}
	
	@Override
	public void copy()
	{
		System.out.println("this is copying");
	}
}
