class Solution {
    public int maxArea(int[] heights) {
        int heightsLen = heights.length;
        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < heightsLen; i++) {
            int area;
            for (int j = i + 1; j < heightsLen; j++) {
                int deltaHeights = Math.min(heights[i], heights[j]);
                area = (j - i) * deltaHeights;
                maxArea = Math.max(area, maxArea);
                // PrettyPrinter.print(i, j, "\t" + (j - i) + " * " + deltaHeights + " = " + area + " / " + maxArea);
            }
        }
        return maxArea;
    }
}
