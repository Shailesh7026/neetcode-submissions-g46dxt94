class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer,Integer> map = new HashMap();
        int result[]= new int[2];
        for(int i=0; i<nums.length ;i++){
            int current = nums[i];
            int need = target - current;
            if(map.containsKey(need)){
                result[0] = map.get(need);
                result[1] = i;
                return result;
            }
            map.put(current,i);
        }

        return result;

    }
}
