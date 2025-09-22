package algoritm.leetcode.grind1;

public class ValidPalindrome125 {

    class Solution {
        public boolean isPalindrome(String s) {

            String answer = s.replaceAll("[^A-Za-z0-9]", "");

            String lowerCase = answer.toLowerCase();

            if(lowerCase.length()==0) return true;

            System.out.println("lowerCase = " + lowerCase);
            for(int i=0; i<lowerCase.length()/2 +1; i++ ){
                if(lowerCase.charAt(i)!=lowerCase.charAt(lowerCase.length()-1-i)) {
                    return false;
                }

            }

            return true;
        }
    }

        public boolean isPalindrome1 (String s) {
         int left =0 , right=s.length()-1;

            while (left < right) {
                while(left<right && ! Character.isLetterOrDigit(s.charAt(left))) left ++;
                while(left<right && ! Character.isLetterOrDigit(s.charAt(right))) right--;

                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)) ) {
                    return false;
                }
                left++;
                right--;
            }


            return  true;

        }

}
