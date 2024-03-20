import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create an arrays of 3 and 4 capacity
        int[] arrayOne = new int[3];
        int[] arrayTwo = new int[3];

        //Input numbers from the user in both arrays
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers :");
        for(int i = 0; i < arrayOne.length; i++){
            arrayOne[i] = sc.nextInt();
        }
        for(int i = 0; i < arrayTwo.length; i++){
            arrayTwo[i] = sc.nextInt();
        }
        sc.close();


        //Check for the equality of arrays
        if(arrayOne.getClass().getSimpleName() == arrayTwo.getClass().getSimpleName()){
            if(arrayOne.length == arrayTwo.length){
                boolean flag = true;
                for(int i = 0; i < arrayOne.length; i++){
                    if(arrayOne[i] != arrayTwo[i]){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    System.out.println("Arrays are equal");
                }else
                    System.out.println("Arrays are not equal");
            }else
                System.out.println("Arrays are not equal");
        }else
            System.out.println("Arrays are not equal");

    }
}
