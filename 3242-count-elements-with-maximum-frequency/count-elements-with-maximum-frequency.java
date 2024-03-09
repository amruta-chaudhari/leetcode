class Solution {
    public int maxFrequencyElements(int[] nums) {
        if(nums.length == 0)
            return 0;

        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        for (int freq : countMap.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        int totalFreq = 0;
        for (int freq : countMap.values()) {
            if (freq == maxFreq) {
                totalFreq += freq;
            }
        }

        return totalFreq;
    }
}