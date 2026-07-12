class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0, r = nums.length - 1, sum = 0;
        while (r > l) {
            sum = nums[r] + nums[l];
            if (sum > target) {
                r--;
            } else if(sum < target) {
                l++;
            } else {
                return new int[]{++l, ++r};
            }
        }

        return new int[] {};
    }
}
