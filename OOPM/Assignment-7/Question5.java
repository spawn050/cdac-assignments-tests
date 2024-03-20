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

        //Find smallest and largest number in an array
        int smallestNumber = array[0];
        int largestNumber = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] < smallestNumber){
                smallestNumber = array[i];
            }

            if(array[i] > largestNumber){
                largestNumber = array[i];
            }
        }

        System.out.println("The smallest number is : " + smallestNumber);
        System.out.println("The largest number is : " + largestNumber);

    }
}
