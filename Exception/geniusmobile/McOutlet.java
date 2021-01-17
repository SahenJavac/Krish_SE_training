/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geniusmobile;

import geniusmobile.Inventory.MobileBrand;
import geniusmobile.exceptions.InvalidBrandException;
import geniusmobile.exceptions.OrderFailureException;


/**
 *
 * @author sahen
 */
public class McOutlet {
    
    public void checkAvalability()throws Exception{
    
        try {
            MobileBrand mobileBrand = new MobileBrand();
            mobileBrand.getBrand("Samsung");
        } catch (InvalidBrandException e) {
            throw new OrderFailureException("Product is out of stock",e);
        }
    }
    
    
    
}
