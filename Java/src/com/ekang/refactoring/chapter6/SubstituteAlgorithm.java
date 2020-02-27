package com.ekang.refactoring.chapter6;

public class SubstituteAlgorithm {
    // if you want to replace an algorithm with one that is clearer
    // Replace the body of the method with the new algorithm

    String foundPerson(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                return "Don";
            }
            if (people[i].equals("John")) {
                return "John";
            }
            if (people[i].equals("Kent")) {
                return "Kent";
            }
        }

        return "";
    }
}
