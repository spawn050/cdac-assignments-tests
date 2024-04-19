import java.util.Scanner;

public class TailRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = calculateSum(arr, size, 0);
        System.out.println("Sum of the array elements is: " + sum);

        sc.close();
    }

 
    public static int calculateSum(int[] arr, int n, int sum) {
        if (n <= 0) {
            return sum;
        } else {
            return calculateSum(arr, n - 1, sum + arr[n - 1]);
        }
    }
}
