class Solution {
    public String toHex(int num) {
        StringBuilder sb = new StringBuilder();
        if (num == 0) return "0";
        char[] hex = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        while (num != 0) {
            sb.insert(0, hex[num&15]);
            num >>>= 4;
        }
        return sb.toString();
    }
}