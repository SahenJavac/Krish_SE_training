
package geniusmobile.Inventory;

import geniusmobile.exceptions.OutOfQuantityException;

/**
 *
 * @author sahen
 */
public class ConnectionType {

    public void getConnection(int connectionType) throws Exception {

        if (connectionType == 5) {
            System.out.println("Your phone is ready to purchase");

        } else {
            throw new OutOfQuantityException("Connection Type is out of stock");

        }

    }

}
