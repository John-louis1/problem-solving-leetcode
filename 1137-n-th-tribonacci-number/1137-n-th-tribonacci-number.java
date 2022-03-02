// Top-bottom approach
class Solution {
    
    static int memo[];
    
    public int tribonacci(int n) {
        memo = new int[38];
        return solve(n);
    }
    
    public static int solve(int n) {
        if (n == 0) 
            return 0;
        if (n == 1) 
            return 1;
        if (n == 2) 
            return 1;
        if (memo[n] != 0)
            return memo[n];
        int res = solve(n-3) + solve(n-2) + solve(n-1);
        memo[n] = res;
        return res;
    }
    
}