class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        for(int i=k-1; i<nums.length ; i++){
            int diff = nums[i] - nums[i-k+1];
            if(diff < minDiff) minDiff = diff;
        }

        return minDiff;
    }
}