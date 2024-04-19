import java.util.Scanner;

public class ReverseFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci series in reverse order:");
        printReverseFibonacci(n);

        sc.close();
    }

 
    public static void printReverseFibonacci(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.print(fibonacci(i) + " ");
        }
    }


    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

