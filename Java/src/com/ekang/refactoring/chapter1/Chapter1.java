package com.ekang.refactoring.chapter1;

public class Chapter1 {
    public static void main(String[] args) {
        Customer customer = new Customer("emma");

        Movie movie1 = new Movie("Catch me if you can", Movie.REGULAR);
        Movie movie2 = new Movie("Inside Out", Movie.CHILDRENS);
        Movie movie3 = new Movie("Invisiable Guest", Movie.NEW_RELEASE);

        Rental rental = new Rental(movie1, 3);
        Rental rental2 = new Rental(movie2, 5);
        Rental rental3 = new Rental(movie3, 2);

        customer.addRental(rental);
        customer.addRental(rental2);

        System.out.println(customer.statement());
        System.out.println(customer.htmlStatement());


    }
}
