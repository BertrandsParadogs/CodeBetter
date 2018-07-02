class Solution {
    public boolean judgeCircle(String moves) {
        int ver = 0;
        int hor = 0;
        for (char dir:moves.toCharArray()) {
            if (dir == 'R') hor++;
            else if (dir == 'L') hor--;
            else if (dir == 'U') ver++;
            else if (dir == 'D') ver--;
        }
        return ver == 0 && hor == 0;
    }
}