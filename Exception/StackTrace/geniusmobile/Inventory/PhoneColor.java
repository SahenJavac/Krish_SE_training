
package geniusmobile.Inventory;

import geniusmobile.exceptions.ColorOutOfStockException;
import geniusmobile.exceptions.InvalidConnectionException;

public class PhoneColor {

    public void getPhoneColor(String phoneColor) throws Exception {

        if (phoneColor.equals("Black")) {
            System.out.println("Phone color is availble");
            try {
                ConnectionType connectionType = new ConnectionType();
                connectionType.getConnection(4);

            } catch (InvalidConnectionException e) {

                throw new ColorOutOfStockException("Color out of stock", e);
            }
        } else {
            System.out.println("Invalid Color");
        }

    }

}
