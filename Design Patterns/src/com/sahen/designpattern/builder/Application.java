package com.sahen.designpattern.builder;

public class Application {


    public static void main(String[] args) {

        Cinema.Builder receiptNo1 = new Cinema.Builder(2, 1);
        Cinema cinema = receiptNo1.setBeverages(true).setMovieName("Avengers").build();

        System.out.println("hall NO- " + cinema.getHallNo() + " Movie Name- " + cinema.getMovieName() + " Seats- " + cinema.getNoOfSeats() + " Beverages- " + cinema.isBeverages());


    }
}
