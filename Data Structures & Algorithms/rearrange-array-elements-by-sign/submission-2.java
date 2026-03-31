class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int results[] = new int[n];
        int i = 0;
        int j = 1;
        int k = 0;
        while(k<n){
           if(nums[k] > 0){
            results[i]=nums[k];
           i+=2;
           }else{
            results[j]=nums[k];
           j+=2;
           }
           k++;
        }

        return results;
    }
}