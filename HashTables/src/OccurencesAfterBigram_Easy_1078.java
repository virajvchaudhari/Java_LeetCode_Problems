import java.util.*;

public class OccurencesAfterBigram_Easy_1078 {
    public static void main(String[] args) {
        String text = "we will we will rock you";
        String first = "we", second = "will";
        String res[] = new OccurencesAfterBigram_Easy_1078().findOcurrences(text,first,second);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

//    public String[] findOcurrences(String text, String first, String second) {
//        List<String> data = new ArrayList<>();
//        Set<String> res = new HashSet<>();
//
//        for (String val : text.split("\\s")){
//                data.add(val);
//        }
//
//
//        for (int i = 0; i < data.size() - 1; i++) {
//            if (data.get(i).equals(first) && data.get(i+1).equals(second)){
//                res.add(data.get(i+2));
//            }
//        }
//        ArrayList arr = new ArrayList(res);
//
//
//        String result[] = new String[arr.size()];
//
//        for (int i = arr.size() - 1, j = 0; i >= 0; i--, j++) {
//            result[j] = String.valueOf(arr.get(i));
//        }
//        return result;
//    }


    public String[] findOcurrences(String text, String first, String second){

        String words[] = text.split("\\s+");

        List<String> result = new ArrayList<>();

        for (int i = 2; i < words.length; i++) {
            if (first.equals(words[i-2]) && second.equals(words[i-1])){
                result.add(words[i]);
            }
        }


        return result.toArray(new String[0]);


//        for (int i = 0; i < words.length; i++) {
//            System.out.println(words[i]);
//        }


//        return new String[0];
    }
}
