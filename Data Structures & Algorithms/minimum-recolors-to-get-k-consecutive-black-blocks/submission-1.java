class Solution {
    public int minimumRecolors(String blocks, int k) {
        int right = 0;
        int count = 0;
        int minCount = 0;

        while(right < k){
            if(blocks.charAt(right) == 'W') count++;
            right++;
        }

        minCount = count;

        for(int left=0; right < blocks.length() ; left++){
            if(blocks.charAt(right) == 'W') count++;
            if(blocks.charAt(left) == 'W') count--;
            right++;

            minCount = Math.min(count,minCount);
        }

        return minCount;
    }
}