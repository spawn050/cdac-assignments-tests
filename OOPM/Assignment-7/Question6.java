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

        //Find the third largest number
        int firstLargestNumber = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > firstLargestNumber)
                firstLargestNumber = array[i];
        }

        //Find the second  largest number
        int secondLargestNumber = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > secondLargestNumber && array[i] < firstLargestNumber)
                secondLargestNumber = array[i];
        }

        //Find the third largest number
        int thirdLargestNumber = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > thirdLargestNumber && array[i] < secondLargestNumber)
                thirdLargestNumber = array[i];
        }

        System.out.println("The third largest number is : " + thirdLargestNumber);

    }
}
