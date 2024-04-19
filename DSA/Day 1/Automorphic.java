import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isAutomorphic(num)) {
            System.out.println(num + " is an Automorphic number.");
        } else {
            System.out.println(num + " is not an Automorphic number.");
        }

        sc.close();
    }

    public static boolean isAutomorphic(int num) {
        int square = num * num;
        
  
        int numDigits = 0;
        int temp = num;
        while (temp != 0) {
            temp /= 10;
            numDigits++;
        }
        
      
        
        int lastDigits = square % (int) Math.pow(10, numDigits);
        
        return lastDigits == num;
    }
}
