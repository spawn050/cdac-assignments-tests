//Assignment - 3, Question - 2

class Passed{
	int result;
	
	Passed(int inputResult){
		result = inputResult;
	}

	Passed(){
		result = 0;
	}

	String getResult(){
		String status;
		if(result == 0){
			status = "No input provided";
			return status;
		}else if(result > 40){
			status = "Passed";
			return status;
		}else{
			status = "Failed";
			return status;
		}
	}
	
	public static void main(String[] args){
		Passed passed = new Passed();
		System.out.println(passed.getResult());

		Passed passed1 = new Passed(20);
		System.out.println(passed1.getResult());

		Passed passed2 = new Passed(80);
		System.out.println(passed2.getResult());
	}
}