class Solution {
    
    static int[] nums;
    static int[] memo;
    
    public int rob(int[] nums) {
        this.nums = nums;
        memo = new int[nums.length];  
        Arrays.fill(memo, -1);
        
        memo[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (i == 1) {
                memo[i] = Math.max(nums[i], memo[i-1]);
            }
            else {
                memo[i] = Math.max((nums[i]+memo[i-2]), memo[i-1]);
            }
        }
        
        return memo[nums.length-1];
    }
}