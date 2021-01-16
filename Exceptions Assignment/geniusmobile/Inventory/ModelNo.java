/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geniusmobile.Inventory;

/**
 *
 * @author sahen
 */
public class ModelNo {
    
    public void getModelNo(String modelNo) throws Exception{
    
        try {
            System.out.println("Model No - S20");
            PhoneColor phonecolor = new PhoneColor();
            phonecolor.getPhoneColor("Red");
        } catch (Exception e) {
            throw new Exception("Models is out of stock",e);
        }
    }
    
}
