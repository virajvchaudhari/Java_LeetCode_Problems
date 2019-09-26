/**
 * Finding common characters.
 *
 * Example 1:
 * Input: ["bella","label","roller"]
 * Output: ["e","l","l"]
 *
 * Example 2:
 * Input: ["cool","lock","cook"]
 * Output: ["c","o"]
 * */



import java.util.*;

public class CommonCharacters_Easy_1002 {
    public static void main(String[] args) {
        String A[] = {"bella", "label", "roller"};
        List<String> result = new CommonCharacters_Easy_1002().commonChars(A);

        for (String val:result) {
            System.out.print(val + " ");
        }
    }

    public List<String> commonChars(String[] A) {

        int dict[] = new int[26];

        // Adding values count for character for the first word in the list.
        for (int i = 0; i < A[0].length(); i++) {
            dict[A[0].charAt(i) - 'a']++;
        }

        for (int i = 1; i < A.length; i++) {
//            Maintaining a dictionary for each word's characters.
            int curr[] = new int[26];

//            Inserting count for the word at the current position.
            for (int j = 0; j < A[i].length(); j++) {
                curr[A[i].charAt(j) - 'a']++;
            }

/*
          If the curr dictionary value count is less than our original dict count
            then the count is replaced in the original dict else remains the same.
            In short, we want the minimum count value.
*/
            for (int j = 0; j < 26; j++) {
                if (curr[j] < dict[j])
                    dict[j] = curr[j];
            }
        }

/*
        Now, what remains is update those values which are > 0 in the list as we
        want to return a list.
*/
        ArrayList<String> sList = new ArrayList<>();


/*      Now here we add the values of the characters to the list
*       First we iterate through the list if dict[i] > 0 then only adding will be done.
*       'a' + integer value adds the character in the list. If two values are present
*       for the same character then dict[i] value will be = 2.
*       So the inner loop, will execute for two times adding the value of the character
*       twice in the list.
* */
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < dict[i]; j++) {
                sList.add(Character.toString((char) ('a' + i)));
            }
        }

        return sList;
    }
}
