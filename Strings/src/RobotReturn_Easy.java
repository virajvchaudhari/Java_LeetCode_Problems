/*
 Mine was:
class Solution {
    public boolean judgeCircle(String moves) {
        int U_count = 0;
        int D_count = 0;
        int R_count = 0;
        int L_count = 0;

        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') {
                U_count++;
            }
            if (moves.charAt(i) == 'D') {
                D_count++;
            }
            if (moves.charAt(i) == 'L') {
                L_count++;
            }
            if (moves.charAt(i) == 'R') {
                R_count++;
            }
        }

        if (D_count == U_count) if (L_count == R_count) {
            return true;
        } else return false;
        else {
            return false;
        }
    }
}
 Best solution for this:
*/


public class RobotReturn_Easy {
    public static void main(String[] args) {
        System.out.println(new RobotReturn_Easy().judgeCircle("LL"));
    }

    public boolean judgeCircle(String moves) {

        int U_count = 0;
        int L_count = 0;

        for (char ch : moves.toCharArray()) {
            switch (ch) {
                case 'U':
                    U_count++;
                    break;
                case 'D':
                    U_count--;
                    break;
                case 'R':
                    L_count--;
                    break;
                case 'L':
                    L_count++;
                    break;
            }
        }
        return U_count == 0 && L_count == 0;
    }
}
