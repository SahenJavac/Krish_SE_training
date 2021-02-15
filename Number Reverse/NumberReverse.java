import java.util.Scanner;

class NumberReverse {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int i = scanner.nextInt();
        int reversedNumber = 0;

        //Reversing the inserted number
        while (i != 0) {
            int x = i % 10;
            reversedNumber = reversedNumber * 10 + x;
            i = i / 10;
        }
        System.out.println("Reversed number - " + reversedNumber);


    }

}