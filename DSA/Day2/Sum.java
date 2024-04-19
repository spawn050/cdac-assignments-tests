import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();

        int sum = calculateSum(n);
        System.out.println("Sum of natural numbers from 1 to " + n + " is: " + sum);

        sc.close();
    }

  
    public static int calculateSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + calculateSum(n - 1);
        }
    }
}

