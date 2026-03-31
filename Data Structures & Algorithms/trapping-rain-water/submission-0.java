class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int ans = 0;

        for(int i=0; i<n ; i++){
            int leftMax=0;
            int rightMax=0;
            int l = i-1;
            int r = i+1;
            while(l >= 0){
                if(height[l] > leftMax){
                    leftMax = height[l];
                }
                l--;
            }

            while(r < n){
                if(height[r] > rightMax){
                    rightMax = height[r];
                }
                r++;
            }

            int waterLevel = Math.min(leftMax, rightMax);
            if(waterLevel > height[i]){
                ans += waterLevel - height[i];
            }
        }

        return ans;
    }

}
