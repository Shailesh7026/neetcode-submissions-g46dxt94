class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0;
        int maxCount = 0;

        for(int i=0 ; i<s.length() ; i++){
            Character ch = s.charAt(i) ;
            if(!map.containsKey(ch)){
                map.put(ch,i);
            }
            else{
                left = Math.max(left, map.get(ch) + 1);
                map.put(ch,i);
            }
                maxCount = Math.max(i-left+1,maxCount);
            
        }

        return maxCount;
    }
}
