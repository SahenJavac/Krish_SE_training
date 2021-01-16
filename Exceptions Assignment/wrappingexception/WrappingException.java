//Unchecked Exception
class InvalidMaterialException extends RuntimeException {
    InvalidMaterialException(String s) {
        super(s);
    }
}

//Checked Exception
class QuantityExceedException extends Exception {
    QuantityExceedException(String s) {
        super(s);
    }
}

public class WrappingException {

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
            e.printStackTrace();
            throw new InvalidMaterialException("Metal");
        }
    }

}