//Assignment-3, Question-18

class Calculator{
	static int number1;
	static int number2;

	static int addition(int inputNumber1, int inputNumber2){
		number1 = inputNumber1;
		number2 = inputNumber2;

		int result = number1 + number2;
		return result;
	}

	static int subtraction(int inputNumber1, int inputNumber2){
		number1 = inputNumber1;
		number2 = inputNumber2;

		int result = number1 - number2;
		return result;
	}

	static int multiplication(int inputNumber1, int inputNumber2){
		number1 = inputNumber1;
		number2 = inputNumber2;

		int result = number1 * number2;
		return result;
	}

	static int division(int inputNumber1, int inputNumber2){
		number1 = inputNumber1;
		number2 = inputNumber2;

		int result = number1 / number2;
		return result;
	}


	//1 -> Addition, 2 -> Subtraction, 3 -> Multiplication, 4 -> Division
	static void selectOperation(int choice, int inputNumber1, int inputNumber2){
		switch(choice){
			case 1:
				System.out.println("Result : " + inputNumber1 + " + " + inputNumber2 + " = " + Calculator.addition(inputNumber1, inputNumber2));
				break;
			case 2:
				System.out.println("Result : " + inputNumber1 + " - " + inputNumber2 + " = " + Calculator.subtraction(inputNumber1, inputNumber2));
				break;
			case 3:
				System.out.println("Result : " + inputNumber1 + " * " + inputNumber2 + " = " + Calculator.multiplication(inputNumber1, inputNumber2));
				break;
			case 4:
				System.out.println("Result : " + inputNumber1 + " / " + inputNumber2 + " = " + Calculator.division(inputNumber1, inputNumber2));
				break;
			default:
				System.out.println("Invalid operation");
		}
	}

	public static void main(String[] args){
		Calculator.selectOperation(0, 5, 5);
	}
}