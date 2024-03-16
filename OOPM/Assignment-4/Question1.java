import java.util.Scanner;

class Student{
    String name;
    int id;
    int rank;

    public void printDetails(){
        System.out.println("Name : " + this.name);
        System.out.println("Id : " + this.id);
        System.out.println("Rank : " + this.rank);
    }

    public void fillDetails(String name, int id, int rank){
        this.name = name;
        this.id = id;
        this.rank = rank;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student1 = new Student();
        student1.printDetails();

        Student student2 = new Student();
        student2.fillDetails("Roy", 20, 25);
        student2.printDetails();

        Student student3 = new Student();
        student3.fillDetails(sc.nextLine(), sc.nextInt(), sc.nextInt());
        student3.printDetails();
         
    }
}
