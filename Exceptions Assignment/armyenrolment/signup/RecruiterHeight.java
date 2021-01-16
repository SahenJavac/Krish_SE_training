/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armyenrolment.signup;

import armyenrolment.exceptions.HeightValidationException;

/**
 *
 * @author sahen
 */
public class RecruiterHeight {
    
    public void heightValidation(int height) throws HeightValidationException {
        if (height >= 150) {

        } else {
            throw new HeightValidationException("You are too short");
        }
    }

    
    
}
