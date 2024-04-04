package com.xworkz.interfacemetroadmin;

import com.xworkz.interfacemetro.ElectionRules;

public class ElectionAdmin {

	private ElectionRules electionRules;
	
	 public ElectionAdmin(ElectionRules electionRules) 
	 {
		
		 this.electionRules=electionRules;
	}
	 public void votingAge() 
	     {
		    if (electionRules != null)
		    {
		        int va = electionRules.votingAge();
		        if (va >= 18) 
		        {
		            System.out.println("Voting age is eligible: " + va);
		        } else 
		        {
		            System.err.println("Voting age is not eligible: " + va);
		        }
		    }
		    } 
	/*
	 * else { System.err.println("Election rules not available"); } }
	 */

	 public void votingProcess()
	 {
		 if(electionRules!=null)
		 {
			 String vp=electionRules.votingProcess();
			 System.out.println("voting process is:"+vp);
		 }
		 else
		 {
			 System.out.println("voting process is not correct");
		 }
	 }
	 public void pollingPlace()
	 {
		 if(electionRules!=null)
		 {
			 String pp=electionRules.pollingPlace();
			 System.out.println("polling place is:"+pp);
		 }
		 else
		 {
			 System.out.println("polling places is not found");
		 }
	 }
	 public void campaigning()
	 {
		 if(electionRules!=null) {
			 boolean c=electionRules.campaigning();
			 System.out.println("campainging is:"+c);
		 }
		 else
		 {
			 System.out.println("campaiging is not doing properly");
		 }
	 }
	 public void voteCounting()
	 {
		 if(electionRules!=null)
		 {
			 long vc=electionRules.voteCounting();
			 System.out.println("voting count is:"+vc);
		 }
		 else
		 {
			 System.out.println("voting count is inncorrect");
		 }
	 }
}
