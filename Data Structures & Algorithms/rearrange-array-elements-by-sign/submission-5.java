class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        while (i < n) {

    // if current position is correct → move on
    if ((i % 2 == 0 && nums[i] > 0) || 
        (i % 2 == 1 && nums[i] < 0)) {
        i++;
        continue;
    }

    // find opposite element to swap
    j = i + 1;
    while (j < n) {
        if ((nums[j] > 0 && i % 2 == 0) || 
            (nums[j] < 0 && i % 2 == 1)) {
            break;
        }
        j++;
    }
int temp = nums[j];
            while (j > i) {
                nums[j] = nums[j - 1];
                j--;
            }
            nums[i] = temp;
}

        return nums;
    }
}