/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armyenrolment.signup;

import armyenrolment.exceptions.AgeValidationException;
import armyenrolment.exceptions.WeightValidationException;

/**
 *
 * @author sahen
 */
public class RecruiterAge {
    
    public void ageValidation(int age) throws AgeValidationException {
        if (age >= 18) {
            try {
                //weightValidation(60);
                RecruiterWeight rcw = new RecruiterWeight();
                rcw.weightValidation(60);
            } catch (WeightValidationException e) {
                System.out.println(e);
            }
        } else {
            throw new AgeValidationException("You are too young");
        }
    }

    
}
