class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i=0 ; i<n ; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1 ; j<n ; j++){
                if(j>i+1 && nums[j] == nums[j-1]) continue;
                int left = j+1;
                int right = n-1;
                long newTarget = (long) target - (nums[i] + nums[j]);

                while(left < right){
                    List<Integer> list = new ArrayList<>();
                    long currSum = (long) nums[left] + (long)nums[right];
                    if(currSum < newTarget){
                        left++;
                    }
                    else if(currSum > newTarget){
                        right--;
                    }else{
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);

                        
                        set.add(list);
                        right--;
                        left++;
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }
}