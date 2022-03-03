class Solution {
    
    static int[] cost;
    static int[] memo;
    
    public int minCostClimbingStairs(int[] cost) {
        this.cost = cost;
        memo = new int[cost.length];
        Arrays.fill(memo, -1);
        return Math.min(solve(0), solve(1));
    }
    
    public static int solve(int i) {
        if (i >= cost.length)
            return 0;
        if (memo[i] != -1)
            return memo[i];
        int res = cost[i] + Math.min(solve(i+1), solve(i+2));
        memo[i] = res;
        return res;
    }
}