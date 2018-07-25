class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        addParenthesis(n, 0, 0, list, "");
        return list;
    }
    
    private void addParenthesis(int n, int open, int close, List<String> list, String s) {
        if (s.length() == n * 2) {
            list.add(s);
            return;
        }
        if (open < n)
            addParenthesis(n, open+1, close, list, s+"(");
        if (close < open)
            addParenthesis(n, open, close+1, list, s+")");
    }
}