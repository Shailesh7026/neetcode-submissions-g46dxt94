class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j = 0;
        while(i < nums.length && j < nums.length){
            while(i < nums.length && nums[i] != 0){
                i++;
            }
            j = Math.max(j, i);
            while(j < nums.length && nums[j] == 0){
                j++;
            }

           if (i < nums.length && j < nums.length) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
           }
        }
    }
}