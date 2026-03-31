class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int zeroSum = 0;
        int maxSum = 0;
        int sum = 0;
        for(int i=0; i<n ; i++){
            zeroSum += (grumpy[i] == 0)? customers[i] : 0;
            if(i < minutes){
                sum += (grumpy[i] == 1)? customers[i] : 0;
            }else{
                sum += ((grumpy[i] == 1)? customers[i] : 0) - ((grumpy[i-minutes] == 1)? customers[i-minutes] : 0);
            } 

            maxSum = Math.max(sum,maxSum);
        }

        

        return maxSum + zeroSum;
    }
}