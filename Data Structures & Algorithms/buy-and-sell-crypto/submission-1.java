class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        
        for(int i=0 ; i<prices.length ; i++){

            if(prices[i] < minPrice){
                minPrice = prices[i];
            }

            int profit = prices[i] - minPrice;

            if(maxProfit < profit){
                maxProfit = profit;
            }

            
        }

        

        if(maxProfit < 0) return 0;

        return maxProfit;
    }
}
