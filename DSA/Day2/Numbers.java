import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number n: ");
        int n = sc.nextInt();

        printNumbers(1, n);

        sc.close();
    }

    
    public static void printNumbers(int start, int end) {
        if (start <= end) {
            System.out.println(start);
            printNumbers(start + 1, end);
        }
    }
}
