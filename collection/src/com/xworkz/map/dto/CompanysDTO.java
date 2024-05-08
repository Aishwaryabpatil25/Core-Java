package com.xworkz.map.dto;

import java.util.Objects;
import java.util.Set;

public class CompanysDTO {

    private String name;
    private Set<EmployeeDTO> employees;

    public CompanysDTO() {
        System.out.println("no param for company details");
    }

    public CompanysDTO(String name, Set<EmployeeDTO> employees) {
        super();
        this.name = name;
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "CompanyDetailsDTO [name=" + name + ", employees=" + employees + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(employees, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CompanysDTO other = (CompanysDTO) obj;
        return Objects.equals(employees, other.employees) && Objects.equals(name, other.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<EmployeeDTO> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<EmployeeDTO> employees) {
        this.employees = employees;
    }
}
