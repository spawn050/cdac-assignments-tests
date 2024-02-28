//Assignment - 3, Question - 16

class PrimeNumber{
	int number;

	PrimeNumber(int inputNumber){
		number = inputNumber;
	}

	PrimeNumber(){
		number = 0;
	}

	void findPrime(){
		if(number == 0 || number == 1){
			System.out.println("The number is neither prime nor composite");
		}else{
			boolean flag = true;
			for(int i = 2; i <= (number/2); i++){
				if(number % i == 0){
					flag = false;
					break;
				}
			}

			if(flag == false){
				System.out.println("The number is not a prime number");
			}else
				System.out.println("The number is a prime number");
		}
		
	}

	public static void main(String[] args){
		PrimeNumber number1 = new PrimeNumber();
		number1.findPrime();

		PrimeNumber number2 = new PrimeNumber(0);
		number2.findPrime();

		PrimeNumber number3 = new PrimeNumber(1);
		number3.findPrime();

		PrimeNumber number4 = new PrimeNumber(54);
		number4.findPrime();

		PrimeNumber number5 = new PrimeNumber(7);
		number5.findPrime();
	}
}