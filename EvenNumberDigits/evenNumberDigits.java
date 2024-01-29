class evenNumberDigits {
    public int findNumbers(int[] nums) {
        int resCount = 0;
        int count = 0;

        for (int num : nums) {
            count = 0;
            while (num != 0) {
                num /= 10;
                ++count;
            }
            if (count % 2 == 0) {
                resCount++;
            }
        }
        return resCount;
    }
}