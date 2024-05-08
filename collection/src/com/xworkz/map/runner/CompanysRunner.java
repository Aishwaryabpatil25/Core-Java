package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.xworkz.map.dto.CompanyDTO;
import com.xworkz.map.dto.CompanysDTO;
import com.xworkz.map.dto.EmployeeDTO;

public class CompanysRunner 
{
    public static void main(String[] args) 
    {
   
    	CompanyDTO company1 = new CompanyDTO("L&T", "12345", "2023-01-01", "Bangalore");
        CompanyDTO company2 = new CompanyDTO("IBM", "67890", "2022-05-15", "Mysore");
        CompanyDTO company3 = new CompanyDTO("Accenture", "54321", "2024-03-10", "Hydrabad");
        CompanyDTO company4 = new CompanyDTO("Global Tech", "98765", "2021-11-20", "Bihar");
        CompanyDTO company5 = new CompanyDTO("InfyNow", "13579", "2023-09-05", "hubli");
        
//    	 CompanysDTO company1 = new CompanysDTO("Accenture",null);
//         CompanysDTO company2 = new CompanysDTO("IBM",null );
//         CompanysDTO company3 = new CompanysDTO("L&T", null);
//         CompanysDTO company4 = new CompanysDTO("Global Tech", null);
//         CompanysDTO company5 = new CompanysDTO("InfyNow", null);
         
        
        
        EmployeeDTO employee1 = new EmployeeDTO("Anusha", "Manager", 50000);
        EmployeeDTO employee2 = new EmployeeDTO("Anjali", "Developer", 40000);
        EmployeeDTO employee3 = new EmployeeDTO("Divya", "HR", 45000);
        EmployeeDTO employee4 = new EmployeeDTO("Disha", "Designer", 42000);
        EmployeeDTO employee5 = new EmployeeDTO("Manisha", "Analyst", 48000);

       

        
        Map<CompanysDTO, Set<EmployeeDTO>> map = new HashMap<>();

        // Create sets of employees for each company
        Set<EmployeeDTO> employeesCompany1 = new HashSet<>();
        employeesCompany1.add(employee1);
        employeesCompany1.add(employee2);
       
        

        Set<EmployeeDTO> employeesCompany2 = new HashSet<>();
        employeesCompany2.add(employee3);
        employeesCompany2.add(employee4);
        employeesCompany2.add(employee5);

        Set<EmployeeDTO> employeesCompany3 = new HashSet<>();
        employeesCompany3.add(employee1);
        employeesCompany3.add(employee5);

        Set<EmployeeDTO> employeesCompany4 = new HashSet<>();
        employeesCompany4.add(employee2);
        employeesCompany4.add(employee3);
        employeesCompany4.add(employee4);
        employeesCompany4.add(employee5);

        Set<EmployeeDTO> employeesCompany5 = new HashSet<>();
        employeesCompany5.add(employee1);
        employeesCompany5.add(employee3);
        employeesCompany5.add(employee4);

        // Add companies and their employees to the map
        map.put(company1, employeesCompany1);
        map.put(company2, employeesCompany2);
        map.put(company3, employeesCompany3);
        map.put(company4, employeesCompany4);
        map.put(company5, employeesCompany5);

       
        map.forEach((company, employees) -> {
            System.out.println("Company: " + company.getName());
            System.out.println("Employees:");
            employees.forEach(employee -> System.out.println("\t" + employee.getName() + " - " + employee.getDesignation() + " - $" + employee.getSalary()));
            System.out.println();
        });
        
    }
}