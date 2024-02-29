//Assignment - 4, Question - 1

class AverageArray{
    public static void main(String[] args){
        int[] array = {5, 4, 3, 9, 1, 7, 9};
        float sum = 0f;
        float result;
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        result = sum / (array.length);
        System.out.println("The average of all the values in the array is " + result);
    }
}