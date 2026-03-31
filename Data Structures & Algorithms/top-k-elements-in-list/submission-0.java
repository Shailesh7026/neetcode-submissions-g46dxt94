class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int[] arr = new int[k];

        for(int i: nums){
               map.put(i,map.getOrDefault(i,0) + 1);
            }

        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b) -> map.get(b) - map.get(a));

        while(k!=0){
           k--;
           arr[k] = list.get(k);
        }

        return arr;
    }
}
