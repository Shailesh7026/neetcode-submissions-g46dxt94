class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for(int i=0; i < n ; i++){
            int target = -nums[i]; 
            Map<Integer,Integer> map = new HashMap<>();
            for(int j=i+1; j < n ; j++){
                List<Integer> list = new ArrayList<>();
                int need = target - nums[j];
                if(map.containsKey(need)){
                    int k = map.get(need);
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);

                    Collections.sort(list);
                    set.add(list);
                        
                }

                map.put(nums[j],j);
               
            }
        }

        return new ArrayList<>(set);
    }
}
