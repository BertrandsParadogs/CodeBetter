class ValidWordAbbr {
    
    private Map<String, Integer> map; // frequency of each abbr
    private Set<String> set; // words we've seen

    public ValidWordAbbr(String[] dictionary) {
        map = new HashMap<>();
        set = new HashSet<>();
        for (String word : dictionary) {
            if (!set.contains(word) && word.length() > 2) {
                set.add(word);
                String abbr = abbreviate(word);
                map.put(abbr, map.getOrDefault(abbr, 0)+1);
            }
        }
    }
    
    public boolean isUnique(String word) {
        if (word.length() <= 2) return true;
        String abbr = abbreviate(word);
        return (set.contains(word)&&map.get(abbr)==1)||(!set.contains(word)&&!map.containsKey(abbr));
    }
    
    private String abbreviate(String word) {
        StringBuilder sb = new StringBuilder();
        sb.append(word.charAt(0));
        sb.append(Integer.toString(word.length()-2));
        sb.append(word.charAt(word.length()-1));
        return sb.toString();
    }
}

/**
 * Your ValidWordAbbr object will be instantiated and called as such:
 * ValidWordAbbr obj = new ValidWordAbbr(dictionary);
 * boolean param_1 = obj.isUnique(word);
 */