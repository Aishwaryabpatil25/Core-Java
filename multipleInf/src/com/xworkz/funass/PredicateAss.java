package com.xworkz.funass;

import com.xworkz.fun.Predicate;

public class PredicateAss
{
	public static <T> boolean receivePredicate(Predicate<T> predicate, T t)
	    {
	        return predicate.handle(t);
	    }
}


