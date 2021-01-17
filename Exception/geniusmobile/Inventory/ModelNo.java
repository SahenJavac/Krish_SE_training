/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
            try {
                PhoneColor phoneColor = new PhoneColor();
                phoneColor.getPhoneColor("Black");
            } catch (ColorOutOfStockException e) {
                throw new InvalidModelNoException("Caused by getModelNo",e);
            }
        } else {
            System.out.println("Invalid Model");
        }

//        try {
//            if (modelNo.equals("s20")) {
//                System.out.println("Model No - S20");
//                PhoneColor phonecolor = new PhoneColor();
//                phonecolor.getPhoneColor("Red");
//
//            }else{
//            
//                throw new InvalidModelNoException("Not a valid Model");
//            }
//        } catch (Exception ex) {
//            System.out.println("Exception Caused By:"+ex);
//        }
    }

}
