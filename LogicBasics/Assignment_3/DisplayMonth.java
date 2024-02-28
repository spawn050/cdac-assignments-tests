//Assignment - 3, Question - 17

class DisplayMonth{
	int number;

	DisplayMonth(int inputNumber){
		number = inputNumber;
	};

	DisplayMonth(){
		number = 0;
	};

	void printMonth(){
		switch(number){
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("February");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
				break;
			case 7:
				System.out.println("July");
				break;
			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println("September");
				break;
			case 10:
				System.out.println("October");
				break;
			case 11:
				System.out.println("November");
				break;
			case 12:
				System.out.println("December");
				break;
			default:
				System.out.println("Invalid number");
		}
	}

	public static void main(String[] args){
		DisplayMonth month1 = new DisplayMonth(5);
		month1.printMonth();

		DisplayMonth month2 = new DisplayMonth();
		month2.printMonth();
	}
}