class Solution {
    /**
    The condition is important.
    ex. [0] - true
     */
    public boolean canJump(int[] nums) {
        int furthest = 0; 
        for (int i = 0; i < nums.length && i <= furthest; i++) {
            furthest = Math.max(furthest, i+nums[i]);
            if (furthest >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}