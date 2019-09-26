import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SegmentsInString_Easy_434 {
    public static void main(String[] args) {
        System.out.println(new SegmentsInString_Easy_434().countSegments(", , , ,        a, eaefa"));
    }

    public int countSegments(String s) {
        String trimmed = s.trim();
        if (trimmed.equals(""))
                return 0;
        return trimmed.split("\\s+").length;


        /** This solution works but above mentioned solution is better.
//         * */
        /*if (s.contains("\\w+") || s.trim().length() == 0) return 0;
        int count = 0;

        *//* //s searches for a single white space character
        * while, //s+ searches for one or more white space characters. *//*
        for (String val: s.trim().split("\\s+")) {
            System.out.println(val);
            count++;
        }

        return count;*/
    }
}
