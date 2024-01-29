class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            } else
                count++;

        }
        System.out.println(nums.length - count);
        return nums.length - count;

    }
}