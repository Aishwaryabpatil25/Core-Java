package com.xworkz.methods.cakerunner;

import com.xworkz.methods.cake.Battery;
import com.xworkz.methods.cake.Colgate;
import com.xworkz.methods.cake.Paint;
import com.xworkz.methods.cake.Ring;
import com.xworkz.methods.cake.SwitchBoard;
import com.xworkz.methods.cake.Table;
import com.xworkz.methods.cake.Tie;

public class Runner {

	public static void main(String[] args) {
		
		   Battery battery = new Battery();
		   battery.capacity=500;
		   battery.voltage=250;
		   battery.reusability="single use";
		   System.out.println(battery);
		   System.out.println(battery.hashCode());
		
		   System.out.println("********************************************************");
		
		   battery.capacity=200;
		   battery.voltage=150;
		   battery.reusability="rechargeable";
		   System.out.println("Updated Values");
		   System.out.println(battery);
		   System.out.println(battery.hashCode());
		
		   System.out.println("______________________________________________________________________________");
				
		   Colgate colgate = new Colgate("Tube","Gel",50);
		   System.out.println(colgate);		
		   System.out.println(colgate.hashCode());
				
		   System.out.println("********************************************************");
		 
		   colgate.packageType="bottle";				 
	       colgate.itemForm="cream";
	       colgate.price=80;			
	       System.out.println("Updated values");
	       System.out.println(colgate);
	       System.out.println(colgate.hashCode());
				
	       System.out.println("______________________________________________________________________________");
	    
	       Paint paint = new Paint();
		   paint.brand="Doms";
		   paint.color="red";
		   paint.price=2500;
		   System.out.println(paint);
		   System.out.println(paint.hashCode());
		
		    System.out.println("*******************************************************");
		
		    paint.brand="Camel";
		    paint.color="pink";
		    paint.price=4000;
		    System.out.println("Updated values");
		    System.out.println(paint);
		    System.out.println(paint.hashCode());
		
	        System.out.println("______________________________________________________________________________");
	    
		    Ring ring = new Ring();
		    ring.type="gold";
		    ring.price=10000;
		    ring.stoneType="round";
		    System.out.println(ring);
		    System.out.println(ring.hashCode());
		
		    System.out.println("***************************************************");
		
		    ring.type="silver";
		    ring.price=26000;
		    ring.stoneType="oval";
		    System.out.println("Updated values");
		    System.out.println(ring);
		    System.out.println(ring.hashCode());
		
		    System.out.println("______________________________________________________________________________");
		
		    SwitchBoard sb = new SwitchBoard(1200,230,"INDRICO");
		    System.out.println(sb);
		    System.out.println(sb.hashCode());
		
		    System.out.println("******************************************************");
		
		    sb.capacity=1500;
		    sb.volt=550;
		    sb.brand="ANCHOR";
		    System.out.println("Updated Values");
		    System.out.println(sb);
		    System.out.println(sb.hashCode());
		  
		    System.out.println("______________________________________________________________________________");
		 
		    Table table = new Table(45,75,"square");
			System.out.println(table);
			System.out.println(table.hashCode());
			
			System.out.println("****************************************************");
			
			table.width=55;
			table.height=85;
			table.shape="rectangle";
			System.out.println("Upadted values");
			System.out.println(table);
			System.out.println(table.hashCode());
		
			System.out.println("_____________________________________________________________");
			
			Tie tie = new Tie();
			tie.size='s';
			tie.occassion="ceremony";
			tie.material="cotton";
			System.out.println(tie);
			System.out.println(tie.hashCode());
			
			System.out.println("*****************************************************");
			
			tie.size='m';
			tie.occassion="bussiness";
			tie.material="silk";
			System.out.println("Updated values");
			System.out.println(tie);
			System.out.println(tie.hashCode());
			

	}
}
