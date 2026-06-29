class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "safekeyword";
        return strs.stream().collect(Collectors.joining(" @|@ "));
    }

    public List<String> decode(String str) {
        if ("safekeyword".equals(str)) return new ArrayList<>();
        return Arrays.asList(str.split(" @\\|@ ", -1));
    }
}
