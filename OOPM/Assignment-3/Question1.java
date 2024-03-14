import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double result = number;

        System.out.println("The integer number is " + number);
        System.out.println("Widening conversion to double is " + result);
    }
