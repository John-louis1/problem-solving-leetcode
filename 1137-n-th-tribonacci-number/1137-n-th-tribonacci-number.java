// Bottom-top approach
class Solution {
    static int memo[];
    
    static void generate(int n) {
        memo = new int [38];
        memo[0] = 0; 
        memo[1] = 1; 
        memo[2] = 1; 
        for (int i = 3; i <= n; i++) {
            memo[i] = memo[i-3] + memo[i-2] + memo[i- 1];
        }
    }
    
    static int tribonacci(int n) {
        generate(n);
        return memo[n];
    }
}

/*

Top-bottom approach

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

*/