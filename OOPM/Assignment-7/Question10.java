import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {65,14,129,34,7};

        int i = 0;
        while(arr[i] == arr[i+1]){
            i++;
        }

        if(arr[i] > arr[i+1]){
            boolean flag = true;
            for(i = i + 1; i < arr.length - 1; i++){
                if(arr[i] > arr[i+1]){
                    continue;
                }else{
                    System.out.println("The array elements are in random order");
                    flag = false;
                    break;
                }

            }
            if(flag){
                System.out.println("The array elements are in descending order");
            }
        }else if(arr[i] < arr[i+1]){
            boolean flag = true;
            for(i = i + 1; i < arr.length - 1; i++){
                if(arr[i] < arr[i+1]){
                    continue;
                }else {
                    System.out.println("The array elements are in random order");
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("The array element are in ascending order");
            }
        }
    }
}
