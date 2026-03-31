class Solution {
    public int maxArea(int[] heights) {

        int i = 0,j = heights.length - 1 ,max = 0;
        while(i<j){
            int capacity = Math.min(heights[i],heights[j]) * (j-i);
            if(capacity > max) max = capacity;
            if(heights[i] < heights[j]){
                i++;
            }else{
                j--;
            }
        }

        return max;
    

    }
}
