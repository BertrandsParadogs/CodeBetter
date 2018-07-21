class Solution {
    public String addBoldTag(String s, String[] dict) {
        boolean[] bold = new boolean[s.length()];
        for (String word : dict) {
            int index = s.indexOf(word);
            while (index != -1) {
                for (int i = index; i < index+word.length(); i++)
                    bold[i] = true;
                index = s.indexOf(word, index+1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bold.length; i++) {
            if (!bold[i] && i > 0 && bold[i-1]) 
                    sb.append("</b>"); 
            else if (bold[i] && (i == 0 || !bold[i-1])) 
                    sb.append("<b>");
            sb.append(s.charAt(i));
        }
        if (bold[bold.length-1]) sb.append("</b>");
        return sb.toString();
    }
}