import java.util.Scanner;
import java.util.Vector;

class Employee{
    String name;
    int rank;
    double marks;

    public void putDetails(String name){
        this.name = name;
    }

    public void putDetails(int rank){
        this.rank = rank;
    }

    public void putDetails(double marks){
        this.marks = marks;
    }

    public void showDetails(){
        System.out.println("Name : " + name);
        System.out.println("Rank : " + rank);
        System.out.println("Marks : " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee1 = new Employee();
        employee1.putDetails("Ronny");
        employee1.putDetails(4);
        employee1.putDetails(80.9);
        employee1.showDetails();
    }
}
