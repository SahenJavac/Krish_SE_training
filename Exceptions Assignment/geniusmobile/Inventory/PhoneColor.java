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
public class PhoneColor {
    
    public void getPhoneColor(String color) throws Exception{
        try{
            System.out.println("Color - Black");
            ConnectionType connectionType = new ConnectionType();
            connectionType.getConnection(4);
        }catch(Exception e){
            throw new Exception("Color is not availbel",e);
        }
    }
    
}
