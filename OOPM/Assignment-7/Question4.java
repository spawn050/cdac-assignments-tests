import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create an array of 5 capacity
        int[] array = new int[5];

        //Input values to assign in array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers in an array:");
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        //Reverse an array
        for(int i = 0; i < array.length; i++){
            int j = array.length - i - 1;
            if(j < i){
                break;
            }
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        //Print an reversed array
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }


    }
}
