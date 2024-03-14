import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        char operation = sc.next().charAt(0);

        switch(operation){
            case '+':
                System.out.println(number1 + " " + "+" + " " + number2 + " " + "=" + " " + (number1+number2));
                break;
            case '-':
                System.out.println(number1 + " " + "-" + " " + number2 + " " + "=" + " " + (number1-number2));
                break;
            case '*':
                System.out.println(number1 + " " + "*" + " " + number2 + " " + "=" + " " + (number1*number2));
                break;
            case '/':
                System.out.println(number1 + " " + "/" + " " + number2 + " " + "=" + " " + (number1/number2));
                break;
            default:
                System.out.println("Incorrect operation provided");

        }
    }
}
