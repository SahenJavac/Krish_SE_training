
package geniusmobile;

import geniusmobile.Inventory.MobileBrand;

/**
 *
 * @author sahen
 */
public class GeniusMobile {

   
    public static void main(String[] args) {
        try {
            MobileBrand mobileBrand = new MobileBrand();
            mobileBrand.getBrand("Samsung");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
      
    }
    
}
