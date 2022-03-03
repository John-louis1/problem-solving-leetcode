class Solution {
    
    static int[] nums;
    static int[] memo;
    
    public int rob(int[] nums) {
        this.nums = nums;
        memo = new int[nums.length];  
        Arrays.fill(memo, -1);
        
        memo[0] = nums[0];
        if (nums.length > 1)
            memo[1] = Math.max(nums[1], memo[0]);
        for (int i = 2; i < nums.length; i++) 
            memo[i] = Math.max((nums[i]+memo[i-2]), memo[i-1]);
        
        return memo[nums.length-1];
    }
}