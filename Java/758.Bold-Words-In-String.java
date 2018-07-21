class Solution {
    public String boldWords(String[] words, String S) {
        boolean[] bold = new boolean[S.length()];
        for (String word : words) {
            int index = S.indexOf(word);
            while (index != -1) {
                for (int i = index; i < index+word.length(); i++)
                    bold[i] = true;
                index = S.indexOf(word, index+1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bold.length; i++) {
            if (!bold[i] && i > 0 && bold[i-1]) 
                    sb.append("</b>"); 
            else if (bold[i] && (i == 0 || !bold[i-1])) 
                    sb.append("<b>");
            sb.append(S.charAt(i));
        }
        if (bold[bold.length-1]) sb.append("</b>");
        return sb.toString();
    }
}