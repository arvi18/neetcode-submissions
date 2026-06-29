class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] productExceptSelfArr = new int[nums.length];

        // if (Arrays.stream(nums).filter(x -> x == 0).limit(2).count() == 2) {
        //     System.out.println("hello");
        //     return new int[nums.length];
        // }

        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                product = 0;
                break;
            }
            product *= nums[i];
        }
        System.out.println(product);
        for (int i = 0; i < nums.length; i++) {
            int numAtIn = nums[i];
            if (numAtIn != 0) {
                productExceptSelfArr[i] = product / nums[i];
            } else {
                productExceptSelfArr[i] = productExceptSelf(nums, i);
            }
        }
        return productExceptSelfArr;
    }

    public int productExceptSelf(int[] nums, int i) {
        int product = 1;
        for (int j = 0; j < nums.length; j++) {
            if (i != j) {
                product *= nums[j];
            }
        }
        return product;
    }
}
