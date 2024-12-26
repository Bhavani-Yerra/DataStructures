package com.leetcode2024.slidingwindow;

public class MaxNumberOfVowelsInASubstringfLengthK {
        public static void main(String[] args) {
            String input = "abciiidef";
            int k = 3;
            System.out.println(maxAvgOfLengthK(input, k));
        }
        public static int maxAvgOfLengthK(String str, int k) {
            int count =0;
            for(int i=0; i< k; i++){
                if(isVowel(str.charAt(i))) count ++;
            }
            int maxCount = count;
            int startIndex = 0;
            int endIndex = k;
            while(endIndex<str.length()){
                if(isVowel(str.charAt(startIndex))) {count = count-1;}
                startIndex++;
                if(isVowel(str.charAt(endIndex))){ count++;}
                endIndex++;

                maxCount = Math.max(count,maxCount);
            }
            return maxCount;
        }

        public static boolean isVowel(char letter){
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                return true;
            }
            return false;
        }
}
