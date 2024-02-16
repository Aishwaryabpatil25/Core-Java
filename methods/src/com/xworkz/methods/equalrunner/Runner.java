package com.xworkz.methods.equalrunner;

import com.xworkz.methods.equal.Button;
import com.xworkz.methods.equal.Carrom;
import com.xworkz.methods.equal.Fan;
import com.xworkz.methods.equal.Glass;
import com.xworkz.methods.equal.Lace;
import com.xworkz.methods.equal.Ladder;
import com.xworkz.methods.equal.Mug;
import com.xworkz.methods.equal.Plate;
import com.xworkz.methods.equal.Shoe;
import com.xworkz.methods.equal.Socks;
import com.xworkz.methods.equal.Stand;

public class Runner {

	public static void main(String[] args) {
		
		Glass glass = new Glass();
		glass.price=150;
		glass.occasion="birthday party";
		glass.brand="Ocean";
		glass.patternType="star";
		glass.color="white";
		glass.shape="round";
		
		Glass glass1 = new Glass();
		glass1.price=150;
		glass1.occasion="birthday party";
		glass1.brand="Ocean";
		glass1.patternType="star";
		glass1.color="white";
		glass1.shape="round";
		
		Glass glass2 = new Glass();
		glass2.price=250;
		glass2.occasion="anniversary party";
		glass2.brand="SYANKA";
		glass2.patternType="floral";
		glass2.color="silver";
		glass2.shape="oval";
		
		
		boolean g =glass.equals(glass1);
		System.out.println(g);
		
		boolean g1 =glass.equals(glass2);
		System.out.println(g1);
		
		boolean g2 =glass1.equals(glass2);
		System.out.println(g2);
		
	    System.out.println("___________________________________________________________");
	
       Ladder ladder = new Ladder();
       ladder.height=100;
       ladder.width=50;
       ladder.price=200;
       ladder.brand="Asian Paints";
       ladder.material="Aluminium";
       ladder.color="sliver";
       
       Ladder ladder1 = new Ladder();
       ladder1.height=100;
       ladder1.width=50;
       ladder1.price=200;
       ladder1.brand="Asian Paints";
       ladder1.material="Aluminium";
       ladder1.color="sliver";
       
       Ladder ladder2 = new Ladder();
       ladder2.height=200;
       ladder2.width=500;
       ladder2.price=5000;
       ladder2.brand="Bathla";
       ladder2.material="Alloy Steel";
       ladder2.color="orange";
       
        boolean l =ladder.equals(ladder1);
		System.out.println(l);
		
		boolean l1 =ladder.equals(ladder2);
		System.out.println(l1);
		
		boolean l2 =ladder1.equals(ladder2);
		System.out.println(l2);
		
		System.out.println("__________________________________________________________");
		
		Plate plate = new Plate();
		plate.pattern="Plaid";
		plate.shape="square";
		plate.brand="ECO SOUL";
		plate.noOfPlate=12;
		plate.price=200;
		plate.color="Beige";
		
		Plate plate1 = new Plate();
		plate1.pattern="Plaid";
		plate1.shape="square";
		plate1.brand="ECO SOUL";
		plate1.noOfPlate=12;
		plate1.price=200;
		plate1.color="Beige";
		
		Plate plate2 = new Plate();
		plate2.pattern="plain";
		plate2.shape="round";
		plate2.brand="Sumeet";
		plate2.noOfPlate=6;
		plate2.price=500;
		plate2.color="silver";
       
		boolean p =plate.equals(plate1);
		System.out.println(p);
		
		boolean p1 =plate.equals(plate2);
		System.out.println(p1);
		
		boolean p2 =plate1.equals(plate2);
		System.out.println(p2);
		
		System.out.println("_________________________________________________________");
		
		Mug mug = new Mug();
		mug.color="black";
		mug.pattern="logo";
		mug.price=120;
		mug.noOfPiece=1;
		mug.type="Coffee Mugs";
		mug.brand="NOSCOMP";
		
		Mug mug1 = new Mug();
		mug1.color="black";
		mug1.pattern="logo";
		mug1.price=120;
		mug1.noOfPiece=1;
		mug1.type="Coffee Mugs";
		mug1.brand="NOSCOMP";
		
		Mug mug2 = new Mug();
		mug2.color="pink";
		mug2.pattern="marbel";
		mug2.price=200;
		mug2.noOfPiece=2;
		mug2.type="tea Mugs";
		mug2.brand="COMP";
		
		boolean m =mug.equals(mug1);
		System.out.println(m);
		
		boolean m1 =mug.equals(mug2);
		System.out.println(m1);
		
		boolean m2 =mug1.equals(mug2);
		System.out.println(m2);
		
		System.out.println("______________________________________________________");
		
		Carrom carrom = new Carrom();
		carrom.material="GSI";
		carrom.genre="Dexterity";
		carrom.brand="wood";
		carrom.noOfPlayers=4;
		carrom.price=1000;
		carrom.color="cream";
		
		Carrom carrom1 = new Carrom();
		carrom1.material="GSI";
		carrom1.genre="Dexterity";
		carrom1.brand="wood";
		carrom1.noOfPlayers=4;
		carrom1.price=1000;
		carrom1.color="cream";
		
		Carrom carrom2 = new Carrom();
		carrom2.material="plastic";
		carrom2.genre="Family";
		carrom2.brand="LAYAN";
		carrom2.noOfPlayers=2;
		carrom2.price=5000;
		carrom2.color="white";
		
		boolean c =carrom.equals(carrom1);
		System.out.println(c);
		
		boolean c1 =carrom.equals(carrom2);
		System.out.println(c1);
		
		boolean c2 =carrom1.equals(carrom2);
		System.out.println(c2);
		
		System.out.println("_________________________________________________________");
		
		Stand stand = new Stand();
		stand.condition="renewed";
		stand.brand="ZEBRONICS";
		stand.color="black";
		stand.price=5000;
		stand.size=30;
		stand.type="light stand";
		
		Stand stand1 = new Stand();
		stand1.condition="renewed";
		stand1.brand="ZEBRONICS";
		stand1.color="black";
		stand1.price=5000;
		stand1.size=30;
		stand1.type="light stand";
		
		Stand stand2 = new Stand();
		stand2.condition="new";
		stand2.brand="Tygot";
		stand2.color="red";
		stand2.price=50;
		stand2.size=10;
		stand2.type="pen stand";
		
		boolean s =stand.equals(stand1);
		System.out.println(s);
		
		boolean s1 =stand.equals(stand2);
		System.out.println(s1);
		
		boolean s2 =stand1.equals(stand2);
		System.out.println(s2);
		
		System.out.println("___________________________________________________________");
		
		Button button = new Button();
		button.shape="round";
		button.material="plastic";
		button.type="shell";
		button.noOfPiece=12;
		button.size=8;
		button.color="red";
		
		Button button1 = new Button();
		button1.shape="round";
		button1.material="plastic";
		button1.type="shell";
		button1.noOfPiece=12;
		button1.size=8;
		button1.color="red";
		
		Button button3 = new Button();
		button3.shape="square";
		button3.material="wood";
		button3.type="shank";
		button3.noOfPiece=22;
		button3.size=12;
		button3.color="pink";
		
		boolean b =button.equals(button1);
		System.out.println(b);
		
		boolean b1 =button.equals(button3);
		System.out.println(b1);
		
		boolean b2 =button1.equals(button3);
		System.out.println(b2);
		
		Fan fan = new Fan();
		fan.brand="usha";
		fan.color="brown";
		fan.type="stand fan";
		fan.blades=4;
		fan.speed=200;
		fan.price=6000;
		
		Fan fan1 = new Fan();
		fan1.brand="usha";
		fan1.color="brown";
		fan1.type="stand fan";
		fan1.blades=4;
		fan1.speed=200;
		fan1.price=6000;
		
		Fan fan2 = new Fan();
		fan2.brand="Havells";
		fan2.color="white";
		fan2.type="wallfan";
		fan2.blades=6;
		fan2.speed=100;
		fan2.price=10000;
		
		boolean f =fan.equals(fan1);
		System.out.println(f);
		
		boolean f1 =fan.equals(fan2);
		System.out.println(f1);
		
		boolean f2 =fan1.equals(fan2);
		System.out.println(f2);
		
		System.out.println("________________________________________________________________");
		
		Shoe shoe = new Shoe();
		shoe.brand="redtape";
		shoe.size='m';
		shoe.type="casual";
		shoe.price=2000;
		shoe.material="";
		shoe.color="white";
		
		Shoe shoe1 = new Shoe();
		shoe1.brand="redtape";
		shoe1.size='m';
		shoe1.type="casual";
		shoe1.price=2000;
		shoe1.material="";
		shoe1.color="white";
		
		Shoe shoe2 = new Shoe();
		shoe2.brand="puma";
		shoe2.size='l';
		shoe2.type="running";
		shoe2.price=1000;
		shoe2.material="canva";
		shoe2.color="red";
		
		boolean sh =shoe.equals(shoe1);
		System.out.println(sh);
		
		boolean sh1 =shoe.equals(shoe2);
		System.out.println(sh1);
		
		boolean sh2 =shoe1.equals(shoe2);
		System.out.println(sh2);
		
		Lace lace = new Lace();
		lace.brand="LOCK LACES";
		lace.color="yellow";
		lace.material="cotton";
		lace.length=120;
		lace.meter=9;
		lace.price=100;
		
		Lace lace1 = new Lace();
		lace1.brand="LOCK LACES";
		lace1.color="yellow";
		lace1.material="cotton";
		lace1.length=120;
		lace1.meter=9;
		lace1.price=100;
		
		Lace lace2 = new Lace();
		lace2.brand="Lify";
		lace2.color="white";
		lace2.material="ployster";
		lace2.length=100;
		lace2.meter=12;
		lace2.price=200;
		
		boolean la=lace.equals(lace1);
		System.out.println(la);
		
		boolean la1 =lace.equals(lace2);
		System.out.println(la1);
		
		boolean la2 =lace1.equals(lace2);
		System.out.println(la2);
		
		System.out.println("___________________________________________________________");
		
		Socks socks = new Socks();
		socks.brand="adidas";
		socks.color="pink";
		socks.price=1000;
		socks.size='s';
		socks.type="anklet";
		socks.style="Classic";
		
		Socks socks1 = new Socks();
		socks1.brand="adidas";
		socks1.color="pink";
		socks1.price=1000;
		socks1.size='s';
		socks1.type="anklet";
		socks1.style="Classic";
		
		Socks socks2 = new Socks();
		socks2.brand="puma";
		socks2.color="white";
		socks2.price=500;
		socks2.size='m';
		socks2.type="low";
		socks2.style="retro";
		
		boolean soc=socks.equals(socks1);
		System.out.println(soc);
		
		boolean soc1 =socks.equals(socks2);
		System.out.println(soc1);
		
		boolean soc2 =socks1.equals(socks2);
		System.out.println(soc2);
	}
}
