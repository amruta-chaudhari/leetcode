class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int len = nums.length;
        int j = 0;
        int[] temp = new int[len];
        
        for (int i = 0; i < nums.length; i++){
            temp[nums[i] - 1] += 1;
        }

        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++){
            if (temp[i] > 1){
                res.add(i+1);
            }
        }
        return res;
    }
}