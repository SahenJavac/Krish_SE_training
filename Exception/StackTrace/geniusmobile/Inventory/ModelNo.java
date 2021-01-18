package geniusmobile.Inventory;

import geniusmobile.exceptions.ColorOutOfStockException;

import geniusmobile.exceptions.InvalidModelNoException;

/**
 *
 * @author sahen
 */
public class ModelNo {

    public void getModelNo(String modelNo) throws Exception {

        if (modelNo.equals("s20")) {
            System.out.println("Model No is available");
            try {
                PhoneColor phoneColor = new PhoneColor();
                phoneColor.getPhoneColor("Black");
            } catch (ColorOutOfStockException e) {

                throw new InvalidModelNoException("Caused by getModelNo", e);
            }
        } else {
            System.out.println("Invalid Model");
        }

    }

}
