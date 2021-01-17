
package geniusmobile;


public class GeniusMobile {

   
    public static void main(String[] args) {
        
        try {
            McOutlet mcOutlet = new McOutlet();
            mcOutlet.checkAvalability();
        } catch (Exception e) {
            
            System.out.println("Attempt Failed "+e);
            
        }
        
      
       
      
    }
    
}
