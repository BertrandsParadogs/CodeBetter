class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] skyline_top = new int[grid[0].length];
        int[] skyline_left = new int[grid.length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                skyline_top[j] = Math.max(skyline_top[j], grid[i][j]);
                skyline_left[i] = Math.max(skyline_left[i], grid[i][j]);
            }
        }
        int res = 0;
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++)
                res += Math.min(skyline_left[i], skyline_top[j]) - grid[i][j];
        return res;
    }
}