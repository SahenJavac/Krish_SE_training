package geniusmobile;

import geniusmobile.exceptions.OrderFailureException;

public class GeniusMobile {

    public static void main(String[] args) {

        try {
            McOutlet mcOutlet = new McOutlet();
            mcOutlet.checkAvalability();
        } catch (OrderFailureException e) {

            System.out.println("Exception Caused By: " + e);
            //e.printStackTrace();

        }

    }

}
