class Solution {
    public int minTotalDistance(int[][] grid) {
        List<Integer> rows = new ArrayList<>();
        List<Integer> cols = new ArrayList<>();
        for (int row = 0; row < grid.length; row++)
            for (int col = 0; col < grid[0].length; col++)
                if (grid[row][col] == 1) {
                    rows.add(row); cols.add(col);
                }
        Collections.sort(cols);
        return getMin1D(rows) + getMin1D(cols);
    }
    
    private int getMin1D(List<Integer> list) {
        int i = 0, j = list.size()-1, sum = 0;
        for (; i < j; i++, j--)
            sum += list.get(j) - list.get(i);
        return sum;
    }
}