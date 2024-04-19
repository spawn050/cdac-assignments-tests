import java.util.Scanner;

public class Mean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        double mean = calculateMean(arr, size);
        System.out.println("Mean of the array is: " + mean);

        sc.close();
    }

  
    public static int calculateSum(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        } else {
            return arr[n - 1] + calculateSum(arr, n - 1);
        }
    }


    public static double calculateMean(int[] arr, int n) {
        int sum = calculateSum(arr, n);
        return (double) sum / n;
    }
}
