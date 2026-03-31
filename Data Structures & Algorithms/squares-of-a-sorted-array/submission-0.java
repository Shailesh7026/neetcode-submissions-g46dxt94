class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j= nums.length - 1;
        int k = nums.length - 1;
        int[] result = new int[j+1];
        while(i<=j && k >= 0){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                result[k] = nums[i]*nums[i];
                k--;
                i++;
            }else{
                result[k] = nums[j]*nums[j];
                k--;
                j--;
            }
        }

        return result;
    }
}