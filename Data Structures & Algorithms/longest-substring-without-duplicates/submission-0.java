class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n= s.length();
        int low=0;
        int result=0;
        Map<Character, Integer> mp= new HashMap<>();

        for(int high=0; high<n; high++)
        {
            char value= s.charAt(high);

            if(mp.containsKey(value))
            {
                low= Math.max(mp.get(value)+1, low);
            }

            mp.put(value, high);
            result= Math.max(result, high-low+1);
        }
        
        return result;
    }
}
