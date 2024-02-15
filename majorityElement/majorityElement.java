class Solution {
    public int majorityElement(int[] nums) {
        int maj = nums.length / 2 ;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int a : nums) {
            map.compute(a, (key, value) -> (value == null) ? 1 : value + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maj) {
                return entry.getKey();
            }

        }
        return nums[0];
    }
}