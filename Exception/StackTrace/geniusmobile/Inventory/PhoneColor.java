/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geniusmobile.Inventory;

import geniusmobile.exceptions.ColorOutOfStockException;

import geniusmobile.exceptions.OutOfQuantityException;

public class PhoneColor {

    public void getPhoneColor(String phoneColor) throws ColorOutOfStockException {

        if (phoneColor.equals("Black")) {
            System.out.println("Phone color is availble");
            try {
                ConnectionType connectionType = new ConnectionType();
                connectionType.getConnection(4);

            } catch (OutOfQuantityException e) {

                throw new ColorOutOfStockException("Color out of stock", e);
            }
        } else {

            System.out.println("Invalid Color");
        }

    }

}
