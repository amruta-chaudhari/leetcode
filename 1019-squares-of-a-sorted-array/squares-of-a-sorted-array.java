class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int len = nums.length;
        int[] result = new int[len];
        int l = 0;
        int r = len - 1;

        for (int i = len-1; i >= 0; i--){
            
            if (Math.abs(nums[l]) > Math.abs(nums[r])) {
                result[i] = nums[l] * nums[l];
                l++;
            } else {
                result[i] = nums[r] * nums[r];
                r--;
            }
        }

        return result;
    }
}