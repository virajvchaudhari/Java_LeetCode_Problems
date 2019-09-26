public class DetectCapital_Easy_520 {
    public static void main(String[] args) {
        System.out.println(new DetectCapital_Easy_520().detectCapitalUse("c"));
    }

    public boolean detectCapitalUse(String word) {
        if (word.length() == 0) return false;

        int count = 0;

        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c))
                count++;
        }

        if (count == word.length())
            return true;
        if (count == 0)
            return true;
        if (Character.isUpperCase(word.charAt(0)) && count - 1 == 0)
            return true;

        return false;
    }
}
