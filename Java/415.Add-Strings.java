class Solution {
    public String addStrings(String num1, String num2) {
        int carry = 0, sum = 0, N1 = num1.length(), N2 = num2.length();
        StringBuilder sb = new StringBuilder();
        for (int i = N1-1, j = N2-1; i >= 0 || j >= 0 || carry == 1; i--, j--) {
            int n1 = i < 0 ? 0 : num1.charAt(i) - '0';
            int n2 = j < 0 ? 0 : num2.charAt(j) - '0';
            sb.append((n1 + n2 + carry) % 10);
            carry = (n1 + n2 + carry) / 10;
        }
        return sb.reverse().toString();
    }
}