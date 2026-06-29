class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        int nonZeroProduct = 1;
        int zeroCount = 0;
        
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                nonZeroProduct *= num;
            }
        }
        
        // If there are 2 or more zeros, every position will result in 0
        if (zeroCount >= 2) {
            return result; 
        }
        
        for (int i = 0; i < n; i++) {
            if (zeroCount == 1) {
                // Only the index holding the single zero gets a non-zero product
                result[i] = (nums[i] == 0) ? nonZeroProduct : 0;
            } else {
                // Standard case with no zeros present
                result[i] = nonZeroProduct / nums[i];
            }
        }
        
        return result;
    }
}
