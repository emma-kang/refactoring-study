package com.ekang.refactoring.chapter6;

/*
 * Use of pass by value often is a source of confusion in Java
 * Java strictly uses pass by value in all place
 */

// deprecated 
import java.util.Date;

public class Param {
    public static void main(String[] args) {
        // The object reference is passed by value.
        // This does not take into account the reassigning of the parameter.
        Date d1 = new Date ("1 Feb 20");
        nextDateUpdate(d1);
        System.out.println("d1 after nextDay: " + d1);

        Date d2 = new Date ("1 Feb 20");
        nextDateUpdate(d2);
        System.out.println("d2 after nextDay: " + d2);
    }

    private static void nextDateUpdate(Date arg) {
        arg = new Date (arg.getYear(), arg.getMonth(), arg.getDate() + 1);
        System.out.println("arg in nextDay: " + arg);
    }

    private static void triple(int arg) {
        arg = arg * 3;
        System.out.println("arg in triple: " + arg);
    }
}
