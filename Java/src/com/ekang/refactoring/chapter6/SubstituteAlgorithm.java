package com.ekang.refactoring.chapter6;

import java.util.Arrays;
import java.util.List;

public class SubstituteAlgorithm {
    // if you want to replace an algorithm with one that is clearer
    // Replace the body of the method with the new algorithm

    String foundPerson(String[] people) {
        List candidates = Arrays.asList(new String[] {"Don", "John", "Kent"});

        for(int i = 0; i < people.length; i++) {
            if (candidates.contains(people[i]))
                return people[i];
        }

        return "";
    }
}
