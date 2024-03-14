import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next().toLowerCase();
        //Write your logic here
        if(input.length() > 1){
            System.out.println("Not a vowel");
        }else if((input.equals("a")) || (input.equals("e")) || (input.equals("i")) || (input.equals("o")) || (input.equals("u"))){
            System.out.println("Vowel");
        }else
            System.out.println("Consonant");
    }
}
