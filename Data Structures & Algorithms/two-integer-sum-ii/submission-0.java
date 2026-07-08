class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int numslen = numbers.length;
        for (int i = 0; i < numslen; i++) {
            int sum = 0;
            for (int j = i + 1; j < numslen; j++) {
                sum = numbers[i] + numbers[j];
                if (sum == target) {
                    return new int[] {i + 1, j + 1};
                }
            }
        }

        return new int[] {};
    }
}
