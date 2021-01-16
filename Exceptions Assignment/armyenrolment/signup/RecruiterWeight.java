
package armyenrolment.signup;

import armyenrolment.exceptions.HeightValidationException;
import armyenrolment.exceptions.WeightValidationException;


public class RecruiterWeight {
    
        public void weightValidation(int weight) throws WeightValidationException {
        if (weight>50) {
            try {
                RecruiterHeight rch = new RecruiterHeight();
                rch.heightValidation(120);
                //heightValidation(120);
            } catch (HeightValidationException ex) {
                System.out.println(ex);
                ex.printStackTrace();
            }
        } else {
            throw new WeightValidationException("You need to gain weight");
        }
    }
    
}
