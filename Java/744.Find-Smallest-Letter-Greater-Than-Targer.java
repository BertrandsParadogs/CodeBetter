class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int lo = 0, hi = letters.length-1;
        if (target >= letters[hi]) return letters[0];
        target++;
        while (lo < hi) {
            int mid = (lo + hi) >>> 1;
            if (target == letters[mid])
                return letters[mid];
            else if (target < letters[mid])
                hi = mid;
            else
                lo = mid + 1;
        }
        return letters[hi];
    }
}