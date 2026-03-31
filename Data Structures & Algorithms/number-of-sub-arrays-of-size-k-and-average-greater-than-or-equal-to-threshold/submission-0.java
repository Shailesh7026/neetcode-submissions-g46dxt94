class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int ans = 0;
        int windowSum = 0;
        int avg = 0;

        for(int i=0 ; i<k ; i++){
            windowSum += arr[i];
        }
        
        if(windowSum >= k * threshold) ans++;

        for(int i=k ; i<arr.length ; i++){
            windowSum = windowSum + arr[i] - arr[i-k];
            if(windowSum >= k * threshold) ans++;
        }

        return ans;
    }
}