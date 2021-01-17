/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geniusmobile.Inventory;

import geniusmobile.exceptions.InvalidBrandException;
import geniusmobile.exceptions.InvalidModelNoException;


/**
 *
 * @author sahen
 */
public class MobileBrand {
    
    public void getBrand(String brandName) throws Exception{
        
        if(brandName.equals("Samsung")){
            try {
               ModelNo modelNo = new ModelNo();
               modelNo.getModelNo("s20");
            } catch (InvalidModelNoException e) {
                throw new InvalidBrandException("Out of stock",e);
            }
        
        }else{
        
            System.out.println("Not an available brand");
        }
        
        
//    try{
//        if (brandName.equals("Samsung")) {
//            System.out.println("Mobile Brand - Samsung");
//            ModelNo modelNo = new ModelNo();
//            modelNo.getModelNo("s20");
//            
//        }else{
//            throw new InvalidBrandException("Not a valid Brand");
//        }
//    
//    }catch(InvalidBrandException ex){
//        System.out.println("Exception Caused By:" +ex);
    
    
        
    }
    
}
