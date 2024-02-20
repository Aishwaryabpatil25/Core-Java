package com.xworkz.encapsulation.runner;

import com.xworkz.encapsulation.methods.Basket;
import com.xworkz.encapsulation.methods.Box;
import com.xworkz.encapsulation.methods.Cock;
import com.xworkz.encapsulation.methods.NailPolish;
import com.xworkz.encapsulation.methods.Pot;

public class Runner {

	public static void main(String[] args) {
		Pot pot = new Pot();

		String pt = pot.getStyle();
		System.out.println(pt);

		int pt1 = pot.getWidth();
		System.out.println(pt1);

		pot.setStyle("garden");
		System.out.println("Style: " + pot.getStyle());

		pot.setWidth(45);
		System.out.println("Width: " + pot.getWidth());

		pot.setBrand("Leafy Tales");
		System.out.println("brand:" + pot.getBrand());

		pot.setColor("pink");
		System.out.println("color:" + pot.getColor());

		pot.setHeight(9);
		System.out.println("height:" + pot.getHeight());

		pot.setShape("round");
		System.out.println("shape:" + pot.getShape());

		System.out.println("_______________________________________________");

		Pot pot1 = new Pot();

		String pt2 = pot1.getStyle();
		System.out.println(pt2);

		int pt3 = pot1.getWidth();
		System.out.println(pt3);

		pot1.setStyle("garden");
		System.out.println("Style: " + pot1.getStyle());

		pot1.setWidth(60);
		System.out.println("width: " + pot1.getWidth());

		pot1.setBrand("gtr");
		System.out.println("brand:" + pot1.getBrand());

		pot1.setColor("pink");
		System.out.println("color:" + pot1.getColor());

		pot1.setHeight(9);
		System.out.println("height:" + pot1.getHeight());

		pot1.setShape("round");
		System.out.println("shape:" + pot1.getShape());

		boolean ref1 = pot.equals(pot1);
		System.out.println(ref1);

		System.out.println("************************************************************");

		Box box = new Box();

		int bx = box.getSize();
		System.out.println(bx);

		String bx1 = box.getShape();
		System.out.println(bx1);

		box.setSize(60);
		System.out.println("Size: " + box.getSize());

		box.setShape("square");
		System.out.println("Shape: " + box.getShape());

		box.setColor("Brown");
		System.out.println("Color : " + box.getColor());

		box.setMaterial("Plastic");
		System.out.println("Material: " + box.getMaterial());

		box.setHeight(200);
		System.out.println("Height: " + box.getHeight());

		box.setType("Zipper");
		System.out.println("Type:" + box.getType());

		System.out.println("_______________________________________________");

		Box box1 = new Box();

		int b = box1.getSize();
		System.out.println(b);

		String bb = box1.getShape();
		System.out.println(bb);

		box1.setSize(60);
		System.out.println("Size: " + box1.getSize());

		box1.setShape("rectangle");
		System.out.println("Shape: " + box1.getShape());

		box1.setColor("orange");
		System.out.println("Color : " + box1.getColor());

		box1.setMaterial("Plastic");
		System.out.println("Material: " + box1.getMaterial());

		box1.setHeight(300);
		System.out.println("Height: " + box1.getHeight());

		box1.setType("Zipper");
		System.out.println("Type:" + box1.getType());

		boolean ref2 = box.equals(box1);
		System.out.println(ref2);

		System.out.println("*********************************************************************");

		Cock cock = new Cock();

		String co = cock.getBrand();
		System.out.println(co);

		int co1 = cock.getPrice();
		System.out.println(co1);

		cock.setBrand("YONEX");
		System.out.println("Brand: " + cock.getBrand());

		cock.setPrice(450);
		System.out.println("Price: " + cock.getPrice());

		cock.setColor("green");
		System.out.println("Color: " + cock.getColor());

		cock.setItemWeight(6);
		System.out.println("Weight: " + cock.getItemWeight());

		cock.setMaterial("plastic");
		System.out.println("Material: " + cock.getMaterial());

		cock.setNoOfCockInpack(5);
		System.out.println("NoOfCock: " + cock.getNoOfCockInpack());

		System.out.println("_______________________________________________");

		Cock cock1 = new Cock();

		String coc2 = cock1.getBrand();
		System.out.println(coc2);

		int coc3 = cock1.getPrice();
		System.out.println(coc3);

		cock1.setBrand("YONEX");
		System.out.println("Brand: " + cock1.getBrand());

		cock1.setPrice(600);
		System.out.println("Price: " + cock1.getPrice());

		cock1.setColor("white");
		System.out.println("Color: " + cock1.getColor());

		cock1.setItemWeight(9);
		System.out.println("Weight: " + cock1.getItemWeight());

		cock1.setMaterial("plastic");
		System.out.println("Material: " + cock1.getMaterial());

		cock1.setNoOfCockInpack(6);
		System.out.println("NoOfCock: " + cock1.getNoOfCockInpack());
		boolean ref3 = cock.equals(cock1);
		System.out.println(ref3);

		System.out.println("****************************************************************");

		Basket basket = new Basket();

		String ket = basket.getKitchenMaterial();
		System.out.println(ket);

		int ket1 = basket.getPrice();
		System.out.println(ket1);

		basket.setKitchenMaterial("Bamboo");
		System.out.println("kitchenMaterial: " + basket.getKitchenMaterial());

		basket.setPrice(300);
		System.out.println("Price: " + basket.getPrice());

		basket.setColor("yellow");
		System.out.println("color:" + basket.getColor());

		basket.setBrand("CELLO");
		System.out.println("brand:" + basket.getBrand());

		basket.setShape("oval");
		System.out.println("shape:" + basket.getShape());

		basket.setStyle("Rustic");
		System.out.println("style:" + basket.getStyle());

		System.out.println("_______________________________________________");

		Basket basket1 = new Basket();

		String ket2 = basket1.getKitchenMaterial();
		System.out.println(ket2);

		int ket3 = basket1.getPrice();
		System.out.println(ket3);

		basket1.setStyle("Bamboo");
		System.out.println("KitchenMaterial: " + basket1.getKitchenMaterial());

		basket1.setPrice(600);
		System.out.println("Price: " + basket1.getPrice());

		basket.setColor("black");
		System.out.println("color:" + basket.getColor());

		basket.setBrand("CELLO");
		System.out.println("brand:" + basket.getBrand());

		basket.setShape("bowl");
		System.out.println("shape:" + basket.getShape());

		basket.setStyle("Rustic");
		System.out.println("style:" + basket.getStyle());
		boolean ref4 = basket.equals(basket1);
		System.out.println(ref4);

		System.out.println("****************************************************");

		NailPolish nail = new NailPolish();

		String polish = nail.getColor();
		System.out.println(polish);

		int polish1 = nail.getPrice();
		System.out.println(polish1);

		nail.setColor("pink");
		System.out.println("Color: " + nail.getColor());

		nail.setPrice(50);
		System.out.println("Price: " + nail.getPrice());

		nail.setBrand("lakme");
		System.out.println("brand:" + nail.getBrand());

		nail.setNetQuantity(6);
		System.out.println("net:" + nail.getNetQuantity());

		nail.setItemForm("gel");
		System.out.println("type:" + nail.getItemForm());

		nail.setType("matte");
		System.out.println("type:" + nail.getType());

		System.out.println("_______________________________________________");

		NailPolish nail1 = new NailPolish();

		String polish2 = nail1.getColor();
		System.out.println(polish2);

		int polish3 = nail1.getPrice();
		System.out.println(polish3);

		nail1.setColor("pink");
		System.out.println("Color: " + nail1.getColor());

		nail1.setPrice(80);
		System.out.println("Price: " + nail1.getPrice());

		nail1.setBrand("lakme");
		System.out.println("brand:" + nail1.getBrand());

		nail1.setNetQuantity(6);
		System.out.println("net:" + nail1.getNetQuantity());

		nail1.setItemForm("gel");
		System.out.println("type:" + nail1.getItemForm());

		nail1.setType("matte");
		System.out.println("type:" + nail1.getType());
		boolean ref5 = nail.equals(nail1);
		System.out.println(ref5);

	}
}
