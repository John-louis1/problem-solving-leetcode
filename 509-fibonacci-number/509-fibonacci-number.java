class Solution {
    static int memo[];
    
    public int fib(int n) {
        memo = new int[31];
        return solve(n);
    }
    
    public static int solve(int n) {
        if (n == 0) 
            return 0;
        if (n == 1) 
            return 1;
        if (memo[n] != 0)
            return memo[n];
        int res = solve(n-1) + solve(n-2);
        memo[n] = res;
        return res;
    }
    
        
}