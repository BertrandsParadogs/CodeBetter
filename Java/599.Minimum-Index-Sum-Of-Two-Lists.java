class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int minSum = Integer.MAX_VALUE;
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < list1.length; i++)
            map.put(list1[i], i);
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                minSum = Math.min(minSum, map.get(list2[i])+i);
                map.put(list2[i], map.get(list2[i]) + i);
                set.add(list2[i]);
            }
        }
        ArrayList<String> res = new ArrayList<>();
        for (String key : map.keySet())
            if (map.get(key) == minSum && set.contains(key))
                res.add(key);
        return res.toArray(new String[res.size()]);
    }
}