import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        int result = (int)number;

        System.out.println("The double number is " + number);
        System.out.println("Narrowing conversion to integer is " + result);
    }
}
