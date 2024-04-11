package com.xworkz.typesrunner;

import com.xworkz.differenttypesinfc.BloodGroup;

public class BloodGroupRunner 
{
    public static void main(String[] args) {
        BloodGroup bloodGroup = () -> {
           
            return true; 
        };

        boolean compatible = bloodGroup.isCompatible();
        System.out.println("Is blood group compatible : " + compatible);
    }
}
