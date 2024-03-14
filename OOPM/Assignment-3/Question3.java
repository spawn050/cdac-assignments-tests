import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BooleanSupplier;

public class Main {
    public static void main(String[] args) {
        int intNumber = 5;
        double doubleNumber = 8.99;
        float floatNumber = 1.66f;
        char character = 't';

//        int answer = intNumber + doubleNumber; //wont work
        int doubleInInt = (int) (intNumber + doubleNumber);
        System.out.println(doubleInInt);

        int floatToInt = (int) floatNumber;
        System.out.println(floatToInt);

        char floatToChar = (char) floatNumber;
        System.out.println(floatToChar);

        double intToDouble = intNumber;
        System.out.println(intToDouble);

        double floatToDouble = floatNumber;
        System.out.println(floatToDouble);

        float intToFloat = intNumber;
        System.out.println(intToFloat);

        float doubleToFloat = (float) doubleNumber;
        System.out.println(doubleToFloat);

    }
}
