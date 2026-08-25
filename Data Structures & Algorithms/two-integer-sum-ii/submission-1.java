class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        int res[]= new int[2];

        int i=0;
        int j= n-1;

        while(j>i)
        {
            int sum= nums[i]+nums[j];

            if(sum==target) break;

            else if(target>sum)
            {
                i++;
            }
            else
            {
                j--;
            }
        }

        res[0]= i+1;
        res[1]= j+1;

        return res;

    }
}
