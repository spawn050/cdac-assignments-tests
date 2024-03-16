import java.util.Scanner;
import java.util.Vector;

class Vehicle{
    public static void honk(){
        System.out.println("HONK");
    }

    public static void honk(int n){
        int i = 0;
        do{
            System.out.println("HONK");
            i++;
        }while (i < n);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehicle.honk();
        Vehicle.honk(2);
         
    }
}