class Person{
	int age = 0;
	float height = 0.0f;
	float weight = 0.0f;
	   

	public static void main(String[] args){
		Person person1 = new Person(10);
		Person person2 = new Person(10, 5.6f, 74.5f);
		Person person3 = new Person(6.3f, 65.9f);
		Person person4 = new Person();

		System.out.println(person1.display());
		System.out.println(person2.display());
		System.out.println(person3.display());
		System.out.println(person4.display());
	}

	Person(int inputAge, float inputHeight, float inputWeight){
		age = inputAge;
		height = inputHeight;
		weight = inputWeight;
	}

	Person(int inputAge){
		age = inputAge;
	}

	Person(float inputHeight, float inputWeight){
		height = inputHeight;
		weight = inputWeight;
	}

	Person(){
		
	}

	String display(){
		String temp = "The age, height and weight of the person is " + age + ", " + height + " and " + weight + " respectively";
		return temp;
	}
}