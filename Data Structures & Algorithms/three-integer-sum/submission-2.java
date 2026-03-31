class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums); 
        for(int i=0; i < n ; i++){
            int target = -nums[i]; 
            int k=n-1;
            int j=i+1;
           while(j < k){
                List<Integer> list = new ArrayList<>();
                int currSum = nums[k] + nums[j];
                if(currSum > target){
                   k--;                        
                }
                else if(currSum < target){
                   j++;                        
                }
                if(currSum == target){
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);

                    Collections.sort(list);
                    set.add(list);
                    j++;
                    k--;
                }

            }
        }

        return new ArrayList<>(set);
    }
}