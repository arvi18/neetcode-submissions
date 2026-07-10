class Solution {
    public int maxArea(int[] heights) {
        int heightsLen = heights.length;
        int i = 0, j = heightsLen - 1, area, maxArea = 0;
        while (j > i) {
            area = (j - i) * Math.min(heights[i], heights[j]);
            maxArea = Math.max(area, maxArea);
            // PrettyPrinter.println(area, maxArea);

            if (heights[i] > heights[j]) {
                j--;
            } else {
                i++;
            }
        }
        return maxArea;
    }
}
