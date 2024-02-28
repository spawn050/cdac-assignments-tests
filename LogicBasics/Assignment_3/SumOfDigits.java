//Assignment - 3, Question -15

class SumOfDigits{
	int number;

	SumOfDigits(int inputNumber){
		number = inputNumber;
	}

	SumOfDigits(){
		number = 0;
	}

	int findSum(){
		int answer = 0;
		do{
			answer = answer + (number % 10);
			number = number / 10;
		}while(number != 0);
		return answer;
	}

	public static void main(String[] args){
		SumOfDigits number1 = new SumOfDigits(52);
		System.out.println(number1.findSum());

		SumOfDigits number2 = new SumOfDigits(0);
		System.out.println(number2.findSum());

		SumOfDigits number3 = new SumOfDigits(5);
		System.out.println(number3.findSum());
	}
}