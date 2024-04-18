package com.xworkz.funass;

import com.xworkz.fun.LongPredicate;

public class LongPredicateAssociation 
{
    public static boolean calculateLongPredicate(LongPredicate longPredicate, long value) 
    {
        return longPredicate.test(value);
    }
}
