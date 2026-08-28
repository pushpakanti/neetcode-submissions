class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int high=1;
        int low=0;
        int maxProfit=0;

        while(high<n)
        {
            if(prices[low]<prices[high])
            {
                int currentProfit= prices[high]-prices[low];
                maxProfit= Math.max(maxProfit, currentProfit);
            }
            else
            {
                low=high;
            }
            high++;
        }

        return maxProfit;
        



    }
}
