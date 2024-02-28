//Assignment - 3, Question - 13

class MultiplicationTables{
	int number;

	MultiplicationTables(int inputNumber){
		number = inputNumber;
	}

	MultiplicationTables(){
		number = 0;
	}

	void printTable(){
		if(number == 0){
			System.out.println("No input number");
		}else{
			for(int i = 1; i < 11; i++){
				System.out.println(number + "x" + i + "=" + (number*i));
			}
		}
		
	}

	public static void main(String[] args){
		MultiplicationTables table1 = new MultiplicationTables();
		table1.printTable();

		MultiplicationTables table2 = new MultiplicationTables(5);
		table2.printTable();
	}
}