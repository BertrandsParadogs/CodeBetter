class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            for (int n = i; n != 0; n /= 10) {
                if (n % 10 == 0 || i%(n%10) != 0) break;
                if (n < 10) res.add(i);
            }
        }
        return res;
    }
}