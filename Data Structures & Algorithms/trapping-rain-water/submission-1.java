class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length - 1, maxL = height[l], maxR = height[r], sum = 0;

        while (r > l) {
            if (maxL < maxR) {
                l++;
                maxL = Math.max(maxL, height[l]);
                sum += maxL - height[l];
                
            } else {
                r--;
                maxR = Math.max(maxR, height[r]);
                sum += maxR - height[r];
            }
        }
        return sum;
    }
}
