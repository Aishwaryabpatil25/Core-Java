package com.xworkz.interfacemetro;

public interface ElectionRules {

	String ELECTION_TYPE = "MP";

	int votingAge();

	String votingProcess();

	String pollingPlace();

	boolean campaigning();

	long voteCounting();
}
