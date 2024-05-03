class Solution {
    public void sortColors(int[] nums) {
        if(nums.length == 1){
            return;
        }
        
        int leftPointer = 0;
        int rightPointer = 0;

        for(; rightPointer < nums.length; rightPointer++){
            if(nums[leftPointer] == 0){
                leftPointer++;
            }else if(nums[rightPointer] == 0){
                swapNum(nums, leftPointer, rightPointer);
                leftPointer++;
            }
        }

        rightPointer--;
        
        for(; rightPointer > leftPointer;){
            if(nums[leftPointer] == 1){
                leftPointer++;
            }else if(nums[rightPointer] == 1){
                swapNum(nums, leftPointer, rightPointer);
                leftPointer++;
                rightPointer--;
            }else
                rightPointer--;
        }
    }

    public static void swapNum(int[] array, int firstIndex, int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}