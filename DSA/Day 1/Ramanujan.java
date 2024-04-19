import java.util.Scanner;

public class Ramanujan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isRamanujan(num)) {
            System.out.println(num + " is a Ramanujan number.");
        } else {
            System.out.println(num + " is not a Ramanujan number.");
        }

        sc.close();
    }

    
    public static boolean isRamanujan(int num) {
        int count = 0;

        
        for (int i = 1; i * i * i < num; i++) {
            for (int j = i + 1; j * j * j < num; j++) {
                int sum = i * i * i + j * j * j;
                if (sum == num) {
                    count++;
                }
                if (count == 2) {
                    return true; }
            }
        }
        return false; 
    }
}

