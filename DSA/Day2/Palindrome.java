import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }

        sc.close();
    }

   
    public static boolean isPalindrome(String str) {
        
        if (str.isEmpty() || str.length() == 1) {
            return true;
        } else {
          
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);
            if (firstChar == lastChar) {
                return isPalindrome(str.substring(1, str.length() - 1));
            } else {
                return false;
            }
        }
    }
}
