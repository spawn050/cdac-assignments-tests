import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create an array of 5 capacity
        int[] array1 = {23, 60, 94, 3, 102};
        int[] array2 = {42, 16, 74};
        int[] targetArray = new int[array1.length + array2.length];

        //Input values to assign in array
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 5 numbers in an array:");
//        for(int i = 0; i < array.length; i++){
//            array[i] = sc.nextInt();
//        }

        int array1Pointer = 0;
        int array2Pointer;xx`
        int targetPointer = 0;
        for(array2Pointer = 0; array2Pointer < array2.length;){
            if(array2Pointer < array1Pointer){
                targetArray[targetPointer] = array2[array2Pointer];
                targetPointer++;
                array2Pointer++;
            }else{
                targetArray[targetPointer] = array1[array1Pointer];
                array1Pointer++;
                targetPointer++;
            }
        }

        for(; array1Pointer < array1.length; array1Pointer++){
            targetArray[targetPointer] = array1[array1Pointer];
            targetPointer++;
        }

        //Print target array
        for(int i = 0; i < targetArray.length; i++){
            System.out.print(targetArray[i] + " ");
        }



    }
}
