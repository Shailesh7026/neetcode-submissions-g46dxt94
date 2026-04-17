class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);

        int maxOc = 0;
        int oc = 1;
        int majElem = nums[0];

        for(int i=1 ; i<nums.length ; i++){
            if(nums[i-1] != nums[i]){
                oc=1;
            }
            oc++;
            if(oc > maxOc){
                maxOc = oc;
                majElem = nums[i];
            }
        }

        return majElem;
    }
}