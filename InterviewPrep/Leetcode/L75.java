//Sorting = O(nlogn), two pointer, two pointer pivot, bucket sort = O(n)
//But, two Pointer pivot >(is better) two pointer > bucket sort > sorting

//Two Pointer Pivot method 
class Solution {
    public void sortColors(int[] nums) {
        int zerosPointer = 0;
        int pointer = 0;
        int twosPointer = nums.length - 1;

        for(; pointer <= twosPointer; ){
            if(nums[pointer] == 0){
                swapNums(nums, pointer, zerosPointer);
                pointer++;
                zerosPointer++;
            }else if(nums[pointer] == 2){
                swapNums(nums, pointer, twosPointer);
                twosPointer--;
            }else
                pointer++;
        }
    }

    public static void swapNums(int[] arr, int firstIndex, int secondIndex){
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}

//Two Pointer method
// class Solution {
//     public void sortColors(int[] nums) {
//         if(nums.length == 1){
//             return;
//         }
        
//         int leftPointer = 0;
//         int rightPointer = 0;

//         for(; rightPointer < nums.length; rightPointer++){
//             if(nums[leftPointer] == 0){
//                 leftPointer++;
//             }else if(nums[rightPointer] == 0){
//                 swapNum(nums, leftPointer, rightPointer);
//                 leftPointer++;
//             }
//         }

//         rightPointer--;
        
//         for(; rightPointer > leftPointer;){
//             if(nums[leftPointer] == 1){
//                 leftPointer++;
//             }else if(nums[rightPointer] == 1){
//                 swapNum(nums, leftPointer, rightPointer);
//                 leftPointer++;
//                 rightPointer--;
//             }else
//                 rightPointer--;
//         }
//     }

//     public static void swapNum(int[] array, int firstIndex, int secondIndex){
//         int temp = array[firstIndex];
//         array[firstIndex] = array[secondIndex];
//         array[secondIndex] = temp;
//     }
// }

//Using Bucket Sort

// class Solution {
//     public void sortColors(int[] nums) {
//         if(nums.length < 2){
//             return;
//         }
        
//         int zeroCount = 0;
//         int onesCount = 0;
//         int twosCount = 0;

//         for(int i = 0; i < nums.length; i++){
//             if(nums[i] == 0)
//                 zeroCount++;
//             else if(nums[i] == 1)
//                 onesCount++;
//             else
//                 twosCount++;
//         }

//         for(int i = 0; i < nums.length; i++){
//             if(zeroCount != 0){
//                 nums[i] = 0;
//                 zeroCount--;
//             }else if(onesCount != 0){
//                 nums[i] = 1;
//                 onesCount--;
//             }else{
//                 nums[i] = 2;
//                 twosCount--;
//             }
//         }
//     }
// }

