class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i=0 ; i<n ; i++){
            int left = i+1;
            int right = n-1;
            int target = -nums[i];

            while(left < right){
                List<Integer> list = new ArrayList<>();
                int currSum = nums[left] + nums[right];
                if(currSum < target){
                    left++;
                }
                else if(currSum > target){
                    right--;
                }else{
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);

                    Collections.sort(list);
                    set.add(list);
                    right--;
                    left++;
                }
            }
        }

        return new ArrayList<>(set);
    }
}
