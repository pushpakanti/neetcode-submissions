class Solution {
    public boolean isPalindrome(String s) {
        int low= 0;
        int high= s.length()-1;

        while(high>low)
        {
            while(high>low && !Character.isLetterOrDigit(s.charAt(low)))
            {
                low++;
            }

            while(high>low && !Character.isLetterOrDigit(s.charAt(high)))
            {
                high--;
            }

           if (Character.toLowerCase(s.charAt(low)) != Character.toLowerCase(s.charAt(high)))
            {
                return false;
            }
            low++;
            high--;

        }

        return true;
    }
}
