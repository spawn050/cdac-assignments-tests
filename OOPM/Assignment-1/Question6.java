import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
        double weight = sc.nextDouble();
        double bmi = weight * (height*height);

        if(bmi <= 18.5){
            System.out.println("Underweight");
        }else if(bmi >= 18.5 && bmi <=24.9){
            System.out.println("Normalweight");
        }else if(bmi >= 25 && bmi <= 29){
            System.out.println("Overweight");
        }else
            System.out.println("Obesity");
    }
}
