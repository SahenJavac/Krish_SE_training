/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geniusmobile.Inventory;

import geniusmobile.exceptions.ColorOutOfStockException;
import geniusmobile.exceptions.InvalidConnectionException;


/**
 *
 * @author sahen
 */
public class PhoneColor {
    
    public void getPhoneColor(String phoneColor) throws Exception{
        
        if(phoneColor.equals("Black")){
            try {
                ConnectionType connectionType = new ConnectionType();
                connectionType.getConnection(4);
                
            } catch (InvalidConnectionException e) {
                throw new ColorOutOfStockException("Color out of stock",e);
            }
        }else{
            System.out.println("Invalid Color");
        }
        
//        try{
//            System.out.println("Color - Black");
//            ConnectionType connectionType = new ConnectionType();
//            connectionType.getConnection(4);
//        }catch(Exception e){
//            throw new Exception("Color is not availbel",e);
//        }
    }
    
}
