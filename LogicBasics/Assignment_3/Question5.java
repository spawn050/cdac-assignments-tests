//Assignment - 3, Question - 5

class Question5{
    public static void main(String[] args){
        int i = getNumber();
        while(i < 10){
            i++;
            int j = getNumber();
            if(j == 0){
                break;
            }else if(j == 1){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("finished");
    }
}

//There can be four possible cases
//First case : i < 10
//Suppose i = 5
//i++, i = 6
//j = 5
//Print 6 and so on
//Output: 6
//7
//8
//9
//finished

//Second case : i = 0
//i++, i = 1
//j = 0
//break;
//Output : finished

//Third case : i = 1
//i++, i = 2
//j = 1
//continue;
//i++, i = 3
//j = 1
//continue;
//and so on...loop will finish without reaching the print statement
//Output : finished

//Fourth case : i > 10
//Output : finished