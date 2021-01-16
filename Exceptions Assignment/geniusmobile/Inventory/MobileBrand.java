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
public class MobileBrand {
    
    public void getBrand(String brandName) throws Exception{
    try{
        if (brandName.equals("Samsung")) {
            System.out.println("Mobile Brand - Samsung");
            ModelNo modelNo = new ModelNo();
            modelNo.getModelNo("s20");
            
        }else{
            System.out.println("Brand is not available");
        }
    
    }catch(Exception e){
        throw new Exception("Out of stock",e);
    
    }
        
    }
    
}
