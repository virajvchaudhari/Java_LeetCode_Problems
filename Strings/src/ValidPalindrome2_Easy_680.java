public class ValidPalindrome2_Easy_680 {
    public static void main(String[] args) {
        System.out.println(new ValidPalindrome2_Easy_680().validPalindrome("abca"));
    }

    public boolean validPalindrome(String s) {

      String result = s.equals(new StringBuilder(s).reverse().toString())? "yes": "no";;
      if (result.equals("yes"))
          return true;
      else
          for (int i = 0; i < s.length(); i++) {
              String send = "";
              for (int j = 0; j < s.length(); j++) {
                  if (j != i)
                      send += s.charAt(j);
              }
              result = send.equals(new StringBuilder(send).reverse().toString())? "yes": "no";;
              if (result.equals("yes"))
                  return true;
          }

        return false;
    }
}
