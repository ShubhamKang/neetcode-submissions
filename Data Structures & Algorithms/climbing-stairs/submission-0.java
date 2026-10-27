class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        int result = fibonacci(n,dp);
        return result;
        
    }
    static int fibonacci(int n, int[] dp){
        if (n <= 2) return n;

        if (dp[n] != 0) return dp[n];

        dp[n] = fibonacci(n - 1, dp) + fibonacci(n - 2, dp);
        return dp[n];
    }
}
