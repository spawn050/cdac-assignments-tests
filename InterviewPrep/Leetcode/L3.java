class Solution {
    public int lengthOfLongestSubstring(String s) {
        int leftPointer = 0;
        int rightPointer = 0;
        int maxLength = 0;

        if(s.length() < 2)
            return s.length();

        Set<Character> set = new HashSet<>();

        for(; rightPointer < s.length();){
            char CharLP = s.charAt(leftPointer);
            char CharRP = s.charAt(rightPointer);
            int currLength = rightPointer - leftPointer + 1;

            if(set.contains(CharRP)){
                set.remove(CharLP);
                leftPointer++;
            }else{
                set.add(CharRP);
                maxLength = currLength > maxLength ? currLength : maxLength;
                rightPointer++;
            }
        }

        return maxLength;
    }
}