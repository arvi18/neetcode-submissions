class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int complement = 0 - nums[i];
            int[] sliced = Arrays.copyOfRange(nums, i + 1, nums.length);
            List<int[]> rests = twoSum(sliced, complement);
            for (int[] rest : rests) {
                List<Integer> currentTriple = new ArrayList<>();
                currentTriple.add(nums[i]);
                currentTriple.add(rest[0]);
                currentTriple.add(rest[1]);
                result.add(currentTriple);
            }
        }

        return result;
    }

    public List<int[]> twoSum(int[] nums, int target) {
        List<int[]> pairs = new ArrayList<>();
        int l = 0, r = nums.length - 1, sum = 0;
        while (r > l) {
            sum = nums[r] + nums[l];
            if (sum > target) {
                r--;
            } else if (sum < target) {
                l++;
            } else {
                pairs.add(new int[] {nums[l], nums[r]});
                while (l < r && nums[l] == nums[l + 1]) l++;
                while (l < r && nums[r] == nums[r - 1]) r--;
                l++;
                r--;
            }
        }

        return pairs;
    }
}