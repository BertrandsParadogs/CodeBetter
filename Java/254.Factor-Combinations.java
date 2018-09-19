class Solution {
    public List<List<Integer>> getFactors(int n) {
        List<List<Integer>> res = new ArrayList<>();
        if (n <= 3) return res;
        helper(n, 2, res, new ArrayList<Integer>());
        return res;
    }
    
    private void helper(int n, int start, List<List<Integer>> res, List<Integer> factors)
    {
        for (int i = start; i <= n / i; i++)
        {
            if (n % i == 0)
            {
                factors.add(i);
                factors.add(n / i);
                res.add(new ArrayList(factors));
                factors.remove(factors.size()-1);
                helper(n / i, i, res, factors);
                factors.remove(factors.size()-1);
            }
        }
    }
    
}