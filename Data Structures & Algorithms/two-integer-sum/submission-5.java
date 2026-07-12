public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i], compliment = target - num;
            if (map.containsKey(compliment)) {
                int complimentIndex = map.get(compliment);
                if (complimentIndex != i) return new int[] { i, complimentIndex };
            }
        }

        return new int[]{};
    }
}