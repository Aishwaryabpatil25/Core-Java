package com.xworkz.typecasting.instancerunner;

import com.xworkz.typecasting.instance.CraftPaper;
import com.xworkz.typecasting.instance.NewsPaper;
import com.xworkz.typecasting.instance.Paper;
import com.xworkz.typecasting.instance.Tissue;

public class PaperRunner 
  {

	public static void main(String[] args)
	{
		
		Tissue tissue = new Tissue();
		
		
		Paper paper = new Paper();
		tissue.runTissue(paper);
		System.out.println("_______________________________________");
		
		
//		CraftPaper craftPaper = new CraftPaper ();
//		tissue.runTissue(craftPaper);

		
		
		Paper paper1 = new CraftPaper();
		tissue.runTissue(paper1);
		System.out.println("_______________________________________");

//		NewsPaper newsPaper = new NewsPaper();
//		tissue.runTissue(newsPaper);
		
		Paper paper2 = new NewsPaper();
		tissue.runTissue(paper2);

	}
 }
