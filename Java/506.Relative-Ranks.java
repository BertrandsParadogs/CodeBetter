class Solution {
    public String[] findRelativeRanks(int[] nums) {
        if (nums.length == 1) return new String[]{"Gold Medal"};
        if (nums.length == 2) {
            if (nums[0] > nums[1])
                return new String[]{"Gold Medal", "Silver Medal"};
            else
                return new String[]{"Silver Medal", "Gold Medal"};
        }
        HashMap<Integer, Integer> indices = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            indices.put(nums[i], i);
        Arrays.sort(nums);
        String[] res = new String[nums.length];
        res[indices.get(nums[nums.length-1])] = "Gold Medal";
        res[indices.get(nums[nums.length-2])] = "Silver Medal";
        res[indices.get(nums[nums.length-3])] = "Bronze Medal";
        for (int i = nums.length - 4; i >= 0; i--)
            res[indices.get(nums[i])] = String.valueOf(nums.length-i);
        return res;
    }
}