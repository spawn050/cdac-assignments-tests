import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int length = calculateLength(input);
        System.out.println("Length of the string: " + length);

        sc.close();
    }

  
    public static int calculateLength(String str) {
       
        if (str.isEmpty()) {
            return 0;
        } else {
  
            return 1 + calculateLength(str.substring(1));
        }
    }
}

