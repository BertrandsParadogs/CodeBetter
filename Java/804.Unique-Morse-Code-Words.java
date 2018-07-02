class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set = new HashSet<>();
        String[] alphabet = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char ch : word.toCharArray())
                sb.append(alphabet[ch-'a']);
            set.add(sb.toString());
        }
        return set.size();
    }
}