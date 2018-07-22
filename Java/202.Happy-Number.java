class Solution {
    public boolean isHappy(int n) {
        if (n < 10)
            return n == 1 || n == 7;
        int m = 0;
        while (n != 0) {
            int x = n % 10;
            m += x * x;
            n /= 10;
        }
        return isHappy(m);
    }
}