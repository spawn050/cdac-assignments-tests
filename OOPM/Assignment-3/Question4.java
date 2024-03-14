import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BooleanSupplier;

public class Main {
    public static void main(String[] args) {
        int number = 15;
        double number1 = number;
        float number2 = number;
        boolean flag;
        if(number >= 1){
            flag = true;
        }else
            flag = false;
        String temp = String.valueOf(number);

        System.out.println("Translated Double number is " + number1);
        System.out.println("Translated Float number is " + number2);
        System.out.println("Translated Boolean flag is " + flag);
        System.out.println("Translated String is " + temp);
    }
}
