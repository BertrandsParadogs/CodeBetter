class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = g.length-1, j = s.length-1;
        for (; i >= 0 && j >= 0; i--)
            if (s[j] >= g[i])
                j--;
        return s.length-1-j;
    }
}