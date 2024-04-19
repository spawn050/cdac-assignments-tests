import java.util.Scanner;

public class DtoB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        String binary = decimalToBinary(decimal);
        System.out.println("Binary equivalent: " + binary);

        sc.close();
    }

    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        } else if (decimal == 1) {
            return "1";
        } else {
            int remainder = decimal % 2;
            int quotient = decimal / 2;
            return decimalToBinary(quotient) + remainder;
        }
    }
}
