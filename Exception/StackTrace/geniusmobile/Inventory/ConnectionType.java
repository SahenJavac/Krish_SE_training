/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geniusmobile.Inventory;

import geniusmobile.exceptions.OutOfQuantityException;

/**
 *
 * @author sahen
 */
public class ConnectionType {

    public void getConnection(int connectionType) throws OutOfQuantityException {

        if (connectionType == 5) {
            System.out.println("Your phone is ready to purchase");

        } else {
            throw new OutOfQuantityException("Connection Type is out of stock");

        }

    }

}
