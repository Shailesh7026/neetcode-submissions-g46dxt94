class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> freq = new HashMap<>();
        int left = 0;
        int maxFreq= 0;
        int maxLen = 0;
        for(int right = 0; right < s.length() ; right++){
           char r = s.charAt(right);
            int charFreq = freq.getOrDefault(r, 0) + 1;
            freq.put(r, charFreq);

            maxFreq = Math.max(maxFreq, charFreq);

            while ((right - left + 1) - maxFreq > k) {
                char l = s.charAt(left);
                freq.put(l, freq.get(l) - 1);
                left++;
            }
            maxLen = Math.max(right-left+1 , maxLen);

        }

        return maxLen;
    }
}
