package com.ekang.refactoring.chapter6;

/*
 * Use of pass by value often is a source of confusion in Java
 * Java strictly uses pass by value in all place 
 */

public class Param {
    public static void main(String[] args) {
        int x = 5;
        triple(x);
        System.out.println("x after triple: " + x);
    }

    private static void triple(int arg) {
        arg = arg * 3;
        System.out.println("arg in triple: " + arg);
    }
}
