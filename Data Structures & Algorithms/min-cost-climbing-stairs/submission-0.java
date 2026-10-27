class Solution {
    public int minCostClimbingStairs(int[] cost) {
        return Math.min(helper(cost.length - 1,cost,new int[cost.length]),helper(cost.length - 2,cost,new int[cost.length]));
    }
    public static int helper(int start,int[] cost, int [] arr){
        if(start <= 1){
            return cost[start];
        }
        if(arr[start] != 0){
            return arr[start];
        }
        arr[start] = cost[start] + Math.min((helper(start - 1,cost,arr)),helper(start-2,cost,arr));
        return arr[start];
    }
}
