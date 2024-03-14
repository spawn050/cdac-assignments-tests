import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number <= 30){
            System.out.println('D');
        }else if(number <= 50){
            System.out.println('C');
        }else if(number <= 80){
            System.out.println('B');
        }else
            System.out.println('A');
    }
}