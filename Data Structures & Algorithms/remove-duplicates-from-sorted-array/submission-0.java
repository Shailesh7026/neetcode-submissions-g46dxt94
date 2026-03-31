class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        
        int l = 0;
        int r = 1;

        while(r < nums.length && l < nums.length){
            while(r < nums.length && nums[r] == nums[l]){
               
               r++;
            }
            if (r < nums.length) {
                l++;
                nums[l] = nums[r];
            }
        }

        return l+1;
    }
}