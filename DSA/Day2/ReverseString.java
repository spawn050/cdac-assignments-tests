import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);

        sc.close();
    }


    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
        
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }
}

