class Solution {
    public String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray())
            sb.append((char)(ch >= 'A' && ch <= 'Z' ? ch + 32 : ch));
        return sb.toString();
    }
}