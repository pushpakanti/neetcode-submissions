class Solution {
    public int maxArea(int[] heights) {
        int len= heights.length;
        int first=0;
        int second= heights.length-1;
        int result= Integer.MIN_VALUE;

        while(second>first)
        {
            int check= (second-first)*Math.min(heights[first], heights[second]);

            if(heights[first]<heights[second]) first++;
            else second--;

            result= Math.max(result, check);
        }

        return result;
    }
}
