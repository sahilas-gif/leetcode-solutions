class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            } else { 
                left = left + 1;
                right = right - 1;
            }
        } return true;
    }
}

