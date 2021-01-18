package geniusmobile.Inventory;

import geniusmobile.exceptions.InvalidBrandException;
import geniusmobile.exceptions.InvalidModelNoException;

/**
 *
 * @author sahen
 */
public class MobileBrand {

    public void getBrand(String brandName) throws InvalidBrandException {

        if (brandName.equals("Samsung")) {
            System.out.println("Mobile Brand is available");
            try {
                ModelNo modelNo = new ModelNo();
                modelNo.getModelNo("s20");
            } catch (InvalidModelNoException e) {
               // e.printStackTrace();

                throw new InvalidBrandException("Out of stock", e);

            }

        } else {

            System.out.println("Not an available brand");
        }

    }

}
