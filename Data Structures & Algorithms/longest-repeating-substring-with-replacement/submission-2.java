class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];
        int left = 0;
        int maxFreq= 0;
        int maxLen = 0;
        for(int right = 0; right < s.length() ; right++){
            maxFreq = Math.max(++freq[s.charAt(right) - 'A'],maxFreq);
            while((right-left+1) - maxFreq > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(right-left+1 , maxLen);

        }

        return maxLen;
    }
}
