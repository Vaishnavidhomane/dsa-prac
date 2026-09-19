class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length - 1;

        for (int j = 0; j <= n; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }

        }
        return i;
    }
}