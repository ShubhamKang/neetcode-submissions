class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minim = Integer.MAX_VALUE;
        for(int i =0; i<prices.length; i++){
            maxProfit = Math.max(maxProfit,prices[i] - minim);
            minim = Math.min(minim,prices[i]);
        }
        return maxProfit;
        
    }
}
