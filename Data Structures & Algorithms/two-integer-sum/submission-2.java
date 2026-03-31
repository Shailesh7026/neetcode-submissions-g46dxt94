class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length ;
        Map<Integer,Integer> map = new HashMap<>();
        int result[] = new int[2];

        for(int i=0;i<n;i++){
            int req = target - nums[i];
            if(map.containsKey(req)){
                result[0] = map.get(req);
                result[1] = i;

                return result;
            }

            map.put(nums[i],i);
        }
        return result;
    }
}
