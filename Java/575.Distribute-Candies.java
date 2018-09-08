class Solution {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> kinds = new HashSet<>();
        for (int candy : candies) kinds.add(candy);
        return Math.min(kinds.size(), candies.length / 2);
    }
}