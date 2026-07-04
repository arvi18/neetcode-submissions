class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;

        List<Integer> numsSorted = Arrays.stream(nums).distinct().sorted().boxed().collect(Collectors.toList());
        System.out.println(numsSorted);

        int maxSequenceCount = 0;
        int sequenceCount = 1;

        for (int i = 0; i < numsSorted.size(); i++) {
            if (sequenceCount == 0) sequenceCount++;
            if (i == 0) {
                sequenceCount = 1;
            } else {
                if (numsSorted.get(i) == numsSorted.get(i - 1) + 1) {
                    sequenceCount += 1;
                } else {
                    if (sequenceCount > maxSequenceCount) {
                        maxSequenceCount = sequenceCount;
                    }
                    sequenceCount = 0;
                }
            }

            if (sequenceCount > maxSequenceCount) {
                maxSequenceCount = sequenceCount;
            }
            // System.out.print(i + ": " + numsSorted.get(i));
            // System.out.print("\t" + sequenceCount + "/ " + maxSequenceCount + "\n");
        }
        return maxSequenceCount;
    }
}
