class Solution {
    public boolean isPalindrome(String s) {
        String new_s= "";
        for(int i=0; i<s.length(); i++)
        {
            char letter= s.charAt(i);
            if(Character.isLetterOrDigit(letter))
            {
                new_s+=Character.toLowerCase(letter);
            }
        }

        int low= 0;
        int high= new_s.length()-1;

        while(high>low)
        {
            if(new_s.charAt(low)!=new_s.charAt(high))
            {
                return false;
            }
            high--;
            low++;
        }
        return true;
    }
}
