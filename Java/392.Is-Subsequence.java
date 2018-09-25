class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        for (; i < s.length() && j < t.length(); j++)
            if (t.charAt(j) == s.charAt(i)) i++;
        return i == s.length();
    }
}