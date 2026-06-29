public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();  // val -> index

        for (int i = 0; i < nums.length; i++) {
            indices.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            Integer complement = target - nums[i];
            
            indices.remove(nums[i], i); // delete key from temp map to not repeat the element already being considered
            if (indices.get(complement) != null){
                return new int[]{i, indices.get(complement)};
            }
        }

        return new int[0];
    }
}