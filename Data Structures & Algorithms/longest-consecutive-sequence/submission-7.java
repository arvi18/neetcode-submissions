class Solution {
    public int longestConsecutive(int[] nums) {
        List<Integer> sortedUnique = Arrays.stream(nums).distinct().sorted().boxed().collect(Collectors.toList());
        System.out.println(sortedUnique);

        if (sortedUnique.size() == 1) return 1;

        List<Integer> sequences = new ArrayList<>();
        Set<Integer> sequence = new HashSet<>();
        if (!sortedUnique.isEmpty()) sequence.add(sortedUnique.get(0));
        System.out.println(sequence);
        boolean didForLoopRan = false;
        for (int i = 1; i < sortedUnique.size(); i++) {
            if (sortedUnique.get(i) == ( sortedUnique.get( i - 1 ) + 1 )) {
                sequence.add(sortedUnique.get(i - 1));
                sequence.add(sortedUnique.get(i));
            } else {
                sequence = new HashSet<>();
            }
            if (!sequence.isEmpty()) {
                sequences.add(sequence.size());
            }
            didForLoopRan = true;
        }
        System.out.println(didForLoopRan);
        System.out.println(sequences);
        if (sortedUnique.isEmpty()) return 0;
        if (!sortedUnique.isEmpty() && sequences.isEmpty()) return 1;
        if (sequences.isEmpty()) return 1;
        if (!didForLoopRan) return 1;
        else return Collections.max(sequences);
    }
}
