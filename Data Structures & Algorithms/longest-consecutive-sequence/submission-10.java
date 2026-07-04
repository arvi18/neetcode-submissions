class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        List<Integer> numsSorted = Arrays.stream(nums).distinct().sorted().boxed().collect(Collectors.toList());
        System.out.println(numsSorted);

        int maxSequenceCount = 1;
        int sequenceCount = 1;

        for (int i = 1; i < numsSorted.size(); i++) {
            if (numsSorted.get(i) == numsSorted.get(i - 1) + 1) {
                sequenceCount += 1;
            } else {
                maxSequenceCount = Math.max(sequenceCount, maxSequenceCount);
                sequenceCount = 1;
            }
            // System.out.print(i + ": " + numsSorted.get(i));
            // System.out.print("\t" + sequenceCount + "/ " + maxSequenceCount + "\n");
        }
        return Math.max(maxSequenceCount, sequenceCount);
    }
}
