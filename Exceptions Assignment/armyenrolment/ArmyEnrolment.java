
package armyenrolment;

import armyenrolment.signup.RecruiterCountry;

public class ArmyEnrolment {

    


    public static void main(String args[]) {
        try {
            RecruiterCountry country = new RecruiterCountry();
            country.countryValidation("Sri Lanka");
           
        } catch (Exception e) {
            System.out.println("Excption " + e);
        }



    }
    
}
