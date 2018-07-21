class Solution {
    public boolean isUgly(int num) {
        if (num > 0)
            for (int i = 5; i >= 2; i--)
                while (num % i == 0)
                    num /= i;
        return num == 1;
    }
}