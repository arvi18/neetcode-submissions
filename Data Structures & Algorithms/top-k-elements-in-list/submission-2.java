class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numFreqMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int frequency = numFreqMap.getOrDefault(nums[i], 0);
            numFreqMap.put(nums[i], ++frequency);
        }
        List<Map.Entry<Integer, Integer>> mapList = numFreqMap.entrySet().stream().collect(Collectors.toList());
        mapList.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());
        return mapList.subList(0, k).stream().mapToInt(x->x.getKey()).toArray();
    }
}
