class Student{
	String name;
	int sub1Marks;
	int sub2Marks;
	int sub3Marks;
	int totalMarks;
	
	
	public static void main(String[] args){
		Student student = new Student("Rohan", 10, 10, 10);
		System.out.println("The name of the student is " + student.name + "and the average marks is " + student.findAverage());
		System.out.println(student.displayDetails());
	}

	Student(String inputName, int inputSub1, int inputSub2, int inputSub3){
		name = inputName;
		sub1Marks = inputSub1;
		sub2Marks = inputSub2;
		sub3Marks = inputSub3;
		totalMarks = inputSub1 + inputSub2 + inputSub3;
	}


	int findAverage(){
		return (totalMarks)/ 3;
	}

	String displayDetails(){
		return name + " " + (sub1Marks + sub2Marks + sub3Marks);
	}
}