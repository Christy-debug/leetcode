class removeDuplicate {
    public int removeDuplicates(int[] nums) {
        int[] temp = new int[nums.length];
        int j = 0;
        if (nums.length == 0 || nums.length == 1)
            return nums.length;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                temp[j++] = nums[i];

            }
        }
        temp[j++] = nums[nums.length - 1];

        for (int k = 0; k < j; k++) {
            nums[k] = temp[k];
        }
        return j;
    }
}