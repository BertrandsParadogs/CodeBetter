class Solution {
    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        boolean neg = num < 0;
        if (neg) num = -num;
        do {
            sb.append(num % 7);
            num /= 7;
        } while (num != 0);
        if (neg) sb.append("-");
        sb.reverse();
        return sb.toString();
    }
}

// or ...

class Solution {
    public String convertToBase7(int num) {
        return Integer.toString(num, 7);
    }
}