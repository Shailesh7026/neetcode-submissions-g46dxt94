class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int j=0;
        int maxFreq = 0;
        long sum = 0;

        if(nums.length == 1) return 1;

        for(int i=0; i<nums.length ; i++){
            sum+=nums[i];
            while((long) nums[i] * (i - j+ 1) - sum > k){
                sum-=nums[j];
                j++;
            }
            maxFreq = Math.max(maxFreq,(i-j+1));
        }

        return maxFreq; 
    }
}