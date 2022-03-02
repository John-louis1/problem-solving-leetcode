class Solution {
    static int memo[];

    static void generateMemoArray() {
        memo = new int [38];
        memo[0] = 0; 
        memo[1] = 1; 
        memo[2] = 1; 
        for (int i = 3; i <= 37; i++) {
            memo[i] = memo[i-3] + memo[i-2] + memo[i- 1];
        }
    }

    static int tribonacci(int n) {
        generateMemoArray();
        return memo[n];
    }
}
