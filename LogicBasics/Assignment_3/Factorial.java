//Assignment - 3, Question - 14

class Factorial{
	int number;

	Factorial(){
		number = 1;
	}

	Factorial(int inputNumber){
		number = inputNumber;
	}

	int getFactorial(){
		if(number == 0 || number == 1){
			return 1;
		}else{
			int temp = number;
			while(temp > 1){
				number = number*(temp-1);
				temp--;
			}
			return number;
		}
		
	}

	public static void main(String[] args){
		Factorial number1 = new Factorial();
		System.out.println(number1.getFactorial());

		Factorial number2 = new Factorial(3);
		System.out.println(number2.getFactorial());

		Factorial number3 = new Factorial(1);
		System.out.println(number3.getFactorial());

		Factorial number4 = new Factorial(0);
		System.out.println(number4.getFactorial());
	}
}