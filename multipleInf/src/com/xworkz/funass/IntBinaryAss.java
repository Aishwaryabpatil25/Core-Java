package com.xworkz.funass;

import com.xworkz.fun.IntBinaryOperator;

public class IntBinaryAss 
   {
       public static int invokeIntBinaryOperator(IntBinaryOperator operator, int left, int right) 
	    {
	        return operator.performAsInt(left, right);
	    }
	}


