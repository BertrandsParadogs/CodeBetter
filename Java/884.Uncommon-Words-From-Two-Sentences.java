class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> wordCount = new HashMap();
        for (String word : (A + " " + B).split(" "))
            wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
        List<String> res = new ArrayList<>();
        for (String word : wordCount.keySet())
            if (wordCount.get(word) == 1)
                res.add(word);
        return res.toArray(new String[res.size()]);
    }
}