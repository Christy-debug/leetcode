class InsertPosition {
    public int searchInsert(int[] nums, int target) {
        int ind = 0;
        if (target <= nums[0])
            return ind;
        else if (target > nums[nums.length - 1])
            return nums.length;

        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] == target)
                ind = i;
            else if (nums[i] < target && nums[i + 1] > target)
                ind = i + 1;
        }
        return ind;
    }
}