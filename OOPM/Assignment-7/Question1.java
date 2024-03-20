public class Main {
    public static void main(String[] args) {
        //Create an array of 10 capacity
        int[] array = new int[10];

        //Input numbers from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers :");
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        sc.close();

        //Print all the numbers from the array
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}