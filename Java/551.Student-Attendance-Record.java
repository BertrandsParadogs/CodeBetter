
public boolean checkRecord(String s) {
    return !s.matches(".*LLL.*|.*A.*A.*");
}

class Solution {
    public boolean checkRecord(String s) {
        return (s.indexOf("A")==s.lastIndexOf("A")) && !s.contains("LLL");
    }
}