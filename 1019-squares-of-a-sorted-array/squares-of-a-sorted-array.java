class Solution {
    public int[] sortedSquares(int[] nums) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        pQueue.add(nums[0] * nums[0]);

        for (int i = 1; i < nums.length; i++){
            int sq = nums[i] * nums[i];
            if (pQueue.peek() < sq ){
                pQueue.add(sq);
            } else {
                int t = pQueue.poll();
                pQueue.add(sq);
                pQueue.add(t);
            }
        }

        int[] result = new int[nums.length];
        int j = 0;

        while(!pQueue.isEmpty()){
            result[j] = pQueue.poll();
            j++;
        }

        return result;
    }
}