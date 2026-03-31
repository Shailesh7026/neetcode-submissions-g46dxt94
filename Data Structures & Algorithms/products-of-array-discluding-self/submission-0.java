class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int suffix = 1;
        int[] ans = new int[n];
        ans[0] = 1;

        for(int i=1; i<n ; i++){
            ans[i] = ans[i-1] * nums[i-1];
        }

        for(int j=n-2; j>=0 ; j--){
            suffix = nums[j+1] * suffix;
            ans[j] *= suffix;
        }

        return ans;
    }
}