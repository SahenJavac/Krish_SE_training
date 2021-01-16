/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armyenrolment.signup;

import armyenrolment.exceptions.AgeValidationException;
import armyenrolment.exceptions.CountryValidationException;

/**
 *
 * @author sahen
 */
public class RecruiterCountry {
    
        public void countryValidation(String country) throws CountryValidationException {
        if (!country.equals("Sri Lanka")) {
            throw new CountryValidationException("Country validation failed");
        } else {
            try {
                RecruiterAge rca = new RecruiterAge();
                rca.ageValidation(23);
                //ageValidation(23);
            } catch (AgeValidationException ex) {
                System.out.println(ex);
            }
        }
    }
    
}
