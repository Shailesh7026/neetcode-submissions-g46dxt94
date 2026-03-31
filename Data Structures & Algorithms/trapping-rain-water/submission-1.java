class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int ans = 0;
        int leftMax=0;
        int rightMax=0;
        int l = 0;
        int r = n-1;

        while(l<=r){
            if(height[l] > height[r]){
                if(height[r] >= rightMax){
                    rightMax = height[r];
                }else{
                    ans += rightMax - height[r];
                }
                r--;
            }else{
                 if(height[l] >= leftMax){
                    leftMax = height[l];
                }else{
                    ans += leftMax - height[l];
                }
                l++;
            }
        }

            return ans;
    }
}


    

