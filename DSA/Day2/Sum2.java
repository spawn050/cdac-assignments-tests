import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = sumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is: " + sum);

        sc.close();
    }

  
    public static int sumOfDigits(int number) {
        if (number == 0) {
            return 0;
        } else {

            return number % 10 + sumOfDigits(number / 10);
        }
    }
}

