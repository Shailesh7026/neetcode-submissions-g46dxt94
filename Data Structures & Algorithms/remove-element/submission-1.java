class Solution {
    public int removeElement(int[] nums, int val) {
        int oc = 0;
        int n = nums.length;
        int j=0;

        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] == val){
                oc++;
                continue;
            }
            nums[j] = nums[i];
            j++;

        }

        return n-oc;
    }
}