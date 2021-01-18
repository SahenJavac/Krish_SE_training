
package mcstore;
import exceptions.*;


public class McStore {

    
    static void quantityCheck(int quantity) throws QuantityExceedException {
        if (quantity > 8) {
            System.out.println("Quantity is low");
        } else {
            throw new QuantityExceedException("Quantity should more than 8 units");
        }
    }
    
    
    public static void main(String[] args) {
        try {
            quantityCheck(5);
        } catch (QuantityExceedException e) {
            System.out.println(e);
            throw new InvalidMaterialException("Metal");
        }
    }
    
}
