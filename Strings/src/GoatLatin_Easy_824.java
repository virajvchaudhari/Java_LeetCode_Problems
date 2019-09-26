import java.util.HashSet;
import java.util.Set;

public class GoatLatin_Easy_824 {
    public static void main(String[] args) {
        System.out.println(new GoatLatin_Easy_824().toGoatLatin("I speak"));
    }

    public String toGoatLatin(String S) {

        Set<Character> vowels = new HashSet<>();
        for (char c: "aeiouAEIOU".toCharArray()) {
            vowels.add(c);
        }
        String result = "";
        int i = 0, j = 0;

        for (String w:
             S.split("\\s")) {
            System.out.println(w);
            result += " " + (vowels.contains(w.charAt(0)) ? w : w.substring(1) + w.substring(0,1)) + "ma";
            System.out.println(result);
            for (j = 0, ++i; j < i; ++j) {
                result += "a";
            }

        }
        return result.substring(1);


    }




//    public String toGoatLatin(String S) {
//
//        StringBuilder sb = new StringBuilder();
//
//        List<String> list = new ArrayList<String>(Arrays.asList(S.split(" ")));
//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).toLowerCase().contains("a") || list.get(i).toLowerCase().contains("e")||
//                    list.get(i).toLowerCase().contains("i") || list.get(i).toLowerCase().contains("u")){
//                sb.append(list.get(i)).append("ma").append("a");
//            }
//        }
//        return "abc";
//    }
}
