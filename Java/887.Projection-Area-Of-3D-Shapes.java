class Solution {
    public int projectionArea(int[][] grid) {
        // 1 <= grid.length = grid[0].length <= 50
        int N = grid.length;
        int res =  N * N;
        for (int i = 0; i < N; i++) {
            int row_max = 0;
            int col_max = 0;
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 0) res--;
                row_max = Math.max(row_max, grid[i][j]);
                col_max = Math.max(col_max, grid[j][i]);
            }
            res += row_max + col_max;
        }
        return res;
    }
}