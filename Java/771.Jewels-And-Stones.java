class Solution {
    public int numJewelsInStones(String J, String S) {
        // Brute force approach
        int result = 0;
        for (char chJ : J.toCharArray())
            for (char chS : S.toCharArray())
                if (chJ == chS)
                    result++;
        return result;
    }
}