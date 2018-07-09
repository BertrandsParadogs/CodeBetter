class Solution {
    public int islandPerimeter(int[][] grid) {
        int[] x_dir = new int[]{1, 0, -1, 0};
        int[] y_dir = new int[]{0, 1, 0, -1};
        int perimeter = 0;
        for (int r = 0; r < grid.length; r++)
            for (int c = 0; c < grid[0].length; c++)
                if (grid[r][c] == 1)
                    for (int dir = 0; dir < x_dir.length; dir++)
                        if(isZeroOrOutOfBound(grid, r + x_dir[dir], c + y_dir[dir]))
                            perimeter++;
        return perimeter;
    }
    
    private boolean isZeroOrOutOfBound(int[][] grid, int r, int c) {
        if (r < 0 || r == grid.length || c < 0 || c == grid[0].length || grid[r][c] == 0) 
            return true;
        return false;
    }
}