class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);
        int degree = 0;
        HashSet<Integer> modes = new HashSet<>();
        for (int key : map.keySet()) {
            if (map.get(key) > degree) {
                modes.clear();
                modes.add(key);
                degree = map.get(key);
            } else if (map.get(key) == degree) {
                modes.add(key);
            }
        }
        int min = nums.length;
        for (int mode : modes) {
            for (int i = 0, j = nums.length -1; i <= j; ) {
                if (nums[i] == mode && nums[j] == mode) {
                    min = Math.min(min, j-i+1);
                    break;
                } else if (nums[i] != mode) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        
        return min;
    }
}