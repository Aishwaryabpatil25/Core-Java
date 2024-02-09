package com.xworkz.typecasting.instance;

public class Tissue
 {

	public void runTissue(Paper paper)
	  {
		paper.size="A4";
		System.out.println(paper.size);
		paper.absorbency();
		
		if(paper instanceof CraftPaper)
		{
			CraftPaper  craftPaper = (CraftPaper )paper;
			System.out.println(craftPaper.color);
			craftPaper.crafting();
		}
		
		if(paper instanceof NewsPaper)
		{
			NewsPaper  newsPaper = (NewsPaper )paper;
			System.out.println(newsPaper.langauageName);
			newsPaper.read();
		}
	}
}
