class Solution {
    public int[][] imageSmoother(int[][] M) {
        int[] x_offset = new int[]{-1, -1, -1, 0, 0, 0, 1, 1, 1};
        int[] y_offset = new int[]{-1, 0, 1, -1, 0, 1, -1, 0, 1};
        int[][] M_new = new int[M.length][M[0].length];
        for (int r = 0; r < M.length; r++) {
            for (int c = 0; c < M[0].length; c++) {
                int sum = 0, count = 0;
                for (int i = 0; i < x_offset.length; i++) {
                    if (r+x_offset[i] >= 0 && r+x_offset[i] < M.length && c+y_offset[i] >= 0 && c+y_offset[i] < M[0].length) {
                        sum += M[r+x_offset[i]][c+y_offset[i]];
                        count++;
                    }
                }
                M_new[r][c] = sum / count;
            }
        }
        return M_new;
    }
}