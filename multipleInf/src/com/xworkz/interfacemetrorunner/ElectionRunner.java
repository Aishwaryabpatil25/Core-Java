package com.xworkz.interfacemetrorunner;

import com.xworkz.interfacemetro.ElectionRules;
import com.xworkz.interfacemetro.MpElectionRulesImpl;
import com.xworkz.interfacemetroadmin.ElectionAdmin;

public class ElectionRunner {

	public static void main(String[] args) {
		
		ElectionRules er=new MpElectionRulesImpl();
		er.voteCounting();
		
		ElectionAdmin ea=new ElectionAdmin(er);
		ea.votingAge();
		ea.votingProcess();
		ea.campaigning();
		ea.pollingPlace();
		ea.voteCounting();
	}
}
