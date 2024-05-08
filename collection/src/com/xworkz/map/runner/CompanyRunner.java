package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;

import com.xworkz.map.dto.CEODTO;
import com.xworkz.map.dto.CompanyDTO;

public class CompanyRunner {

    public static void main(String[] args) {
        
        CompanyDTO company = new CompanyDTO("Accenture Company", "GST123", "2000-01-11", "Bangalore");
        CompanyDTO company2 = new CompanyDTO("TCS Company", "GST122", "1999-05-17", "Hubli");
        CompanyDTO company3 = new CompanyDTO("Zoho Company", "GST124", "1995-02-15", "Mysore");
        CompanyDTO company4 = new CompanyDTO("Oracle Company", "GST125", "2001-06-12", "Mumbai");
        CompanyDTO company5 = new CompanyDTO("IBM Company", "GST128", "2005-08-22", "delhi");
        
        CEODTO ceo = new CEODTO("Aadi", 10, "Mysore", 100000D);
        CEODTO ceo2 = new CEODTO("Deepa", 4, "Gadag", 200000D);
        CEODTO ceo3 = new CEODTO("Anju", 2, "Durga", 450000D);
        CEODTO ceo4 = new CEODTO("Divya", 3, "Mandya", 500000D);
        CEODTO ceo5 = new CEODTO("Vineeth",6, "Bidar", 600000D);
        
        Map<String, Object> companyInfo = new HashMap<String, Object>();
        companyInfo.put("Company 1", company);
        companyInfo.put("CEO 1", ceo);
        companyInfo.put("Company 2", company2);
        companyInfo.put("CEO 2", ceo2);
        companyInfo.put("Company 3", company3);
        companyInfo.put("CEO 3", ceo3);
        companyInfo.put("Company 4", company4);
        companyInfo.put("CEO 4", ceo4);
        companyInfo.put("Company 5", company5);
        companyInfo.put("CEO 5", ceo5);

        
        companyInfo.forEach((key, value) -> {
            System.out.println(key + ":");
            if (value instanceof CompanyDTO) {
                System.out.println(value);
            } else if (value instanceof CEODTO) {
                System.out.println(value);
            }
        });
    }
}
