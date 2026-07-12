class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i], compliment = target - num;
            if (map.containsKey(compliment)) {
                int complimentIndex = map.get(compliment);
                if (complimentIndex != i)
                    return new int[] {i + 1, complimentIndex + 1};
            }
        }

        return new int[] {};
    }
}
