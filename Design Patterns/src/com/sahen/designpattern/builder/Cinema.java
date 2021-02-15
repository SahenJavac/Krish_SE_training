package com.sahen.designpattern.builder;

public class Cinema {
    private int noOfSeats;
    private int hallNo;
    private String movieName;
    private boolean beverages;

    public Cinema(Builder builder) {
        this.noOfSeats = builder.noOfSeats;
        this.hallNo = builder.noOfSeats;
        this.movieName = builder.movieName;
        this.beverages = builder.beverages;

    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public int getHallNo() {
        return hallNo;
    }

    public String getMovieName() {
        return movieName;
    }

    public boolean isBeverages() {
        return beverages;
    }

    static class Builder {
        private int noOfSeats;
        private int hallNo;
        private String movieName;
        private boolean beverages;

        public Builder(int noOfSeats, int hallNo) {
            this.noOfSeats = noOfSeats;
            this.hallNo = hallNo;
        }

        public Builder setNoOfSeats(int noOfSeats) {
            this.noOfSeats = noOfSeats;
            return this;
        }

        public Builder setHallNo(int hallNo) {
            this.hallNo = hallNo;
            return this;
        }

        public Builder setMovieName(String movieName) {
            this.movieName = movieName;
            return this;
        }

        public Builder setBeverages(boolean beverages) {
            this.beverages = beverages;
            return this;
        }

        public Cinema build(){
            Cinema cinema = new Cinema(this);
            return cinema;
        }
    }

}
