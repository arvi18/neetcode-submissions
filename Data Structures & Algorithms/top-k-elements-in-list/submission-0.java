class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numFreqMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int frequency = numFreqMap.getOrDefault(nums[i], 0);
            numFreqMap.put(nums[i], ++frequency);
        }
        List<Map.Entry<Integer, Integer>> mapList = numFreqMap.entrySet().stream().collect(Collectors.toList());
        Collections.sort(mapList, Map.Entry.<Integer, Integer>comparingByValue().reversed());
        
        List<Map.Entry<Integer, Integer>> finalList = mapList.subList(0, k);
        return finalList.stream().mapToInt(x->x.getKey()).toArray();
    }
}
