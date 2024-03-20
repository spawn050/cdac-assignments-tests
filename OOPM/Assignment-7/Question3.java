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

        //Input target value to be compared to
        System.out.println("Enter the target value:");
        int target = sc.nextInt();

        sc.close();

        //To store pairs
        int[][] pairs = new int[(array.length * array.length)][2];

        //Check for the pairs
        int row = 0;
        boolean flag = false;
        for(int fixedPointer = 0; fixedPointer < array.length - 1; fixedPointer++){
            for(int slidingPointer = fixedPointer + 1; slidingPointer < array.length; slidingPointer++){
                if(array[fixedPointer] + array[slidingPointer] == target){
                    pairs[row][0] = fixedPointer;
                    pairs[row][1] = slidingPointer;
                    row++;
                    flag = true;
                }
            }
        }

        //print pairs
        if(flag == true){
            System.out.println("The pairs are:");
            for(int i = 0; i < array.length; i++){
                if(pairs[i][0] == 0 && pairs[i][1] == 0){
                    break;
                }
                System.out.println(pairs[i][0] + " " + pairs[i][1]);
            }
        }else
            System.out.println("There are no pairs whose addition leads to the target number");


    }
}
