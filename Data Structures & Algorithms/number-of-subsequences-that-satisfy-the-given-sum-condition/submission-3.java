class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        int j = n-1;
        int mod = 1_000_000_007;
        int count = 0;

        int[] power = new int[n];
        power[0] = 1;

        for (int k = 1; k < n; k++) {
            power[k] = (power[k - 1] * 2) % mod;
        }
         
        while(i<=j){
            int currSum = nums[i] + nums[j];
            if(currSum <= target){
                count = (count+power[j-i]) % mod;
                i++;
            }else{
                j--;
            }

        }

        return count;
    }
}