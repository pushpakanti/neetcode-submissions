class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mp= new HashMap<>();
        int res[]= new int[k];

        for(int i=0; i<nums.length; i++)
        {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
        }

        PriorityQueue<Integer> maxheap= new PriorityQueue<>((a,b)-> mp.get(b)-mp.get(a));

        maxheap.addAll(mp.keySet());

        for(int i=0; i<k; i++)
        {
            res[i]= maxheap.poll();
        }

        return res;




    }
}
