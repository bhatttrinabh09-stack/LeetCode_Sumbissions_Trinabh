class Solution {
    public int maximumCount(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int pos = 0, neg = 0;
        while((r >= 0) && (nums[r] > 0)){
            pos++;
            r--;
        }
        while((l < nums.length) && (nums[l] < 0)){
            neg++;
            l++;
        }
        return Math.max(pos, neg);
    }
}