class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int[] zeroShift = new int[nums.length];
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos++] = nums[i];
            }
        }

        while (pos <= nums.length - 1) {
            nums[pos] = 0;
            pos++;
        }

    }
}