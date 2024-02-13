package com.xworkz.methods.cake;

public class Tie {

	public char size;
	public String occassion="ceremony";
	public String material="cotton";
	
	
	public Tie()
	{
		System.out.println("no param for tie");
	}
	
	public Tie(char size,String occassion,String material)
	{
		this.size=size;
		this.occassion=occassion;
		this.material=material;
	}
	
	public void wear()
	{
		System.out.println("this for tie wear");
	}
	@Override
	public String toString() {
		
		return "size:"+size+"\t"+"occassion:"+occassion+"\t"+"material:"+material;
		
	}
}
