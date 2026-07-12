class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length - 1, maxL = height[l], maxR = height[r], sum = 0;

        while (r > l) {
            if (maxL < maxR) {
                l++;
                maxL = Math.max(maxL, height[l]);
                int water = Math.min(maxL, maxR) - height[l];
                sum += Math.max(water, 0);
            } else {
                r--;
                maxR = Math.max(maxR, height[r]);
                int water = Math.min(maxL, maxR) - height[r];
                sum += Math.max(water, 0);
            }
        }
        return sum;
    }
}
