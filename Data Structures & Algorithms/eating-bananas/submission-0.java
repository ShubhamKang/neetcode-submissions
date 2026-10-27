class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        if(piles.length == 0){
            max = 0;
        }
        for (int i = 1;i<piles.length;i++){
            if(piles[i] > max){
                max = piles[i];
            }
        }

        int left = 1;
        int right = max;

        int hours = 0;
        int ans = 0;

        while(left <= right){
            int mid = (left + right) / 2;
            int count_hours = 0;
            for(int i = 0; i<piles.length; i++){
                count_hours += (piles[i] + mid - 1)/mid;
            }
            if(count_hours <= h){
                right = mid - 1;
                ans = mid;
            }
            else{
                left = mid + 1;
            }
            
        }
        return ans;
        
    }
}
