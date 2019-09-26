import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatching_Hard_10 {
    public static void main(String[] args) {
        new RegexMatching_Hard_10().isMatch("aa","a");
    }

    public boolean isMatch(String s, String p) {

        Pattern pattern = Pattern.compile(p);
        Matcher m = pattern.matcher(s);
        
        if (m.find()){
            System.out.println("m.group() = " + m.group());
        }
        return true;
    }
}
