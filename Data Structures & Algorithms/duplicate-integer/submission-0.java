// Hashing
// O(n)

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet(nums.length);
        for (int i = 0; i < nums.length; i++) {
            Integer curr = nums[i];
            if (seen.contains(curr)){
                return true;
            } else {
                seen.add(curr);
            }
        }
        return false;
    }
}