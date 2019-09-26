import java.util.HashSet;

public class UniqueMail_Easy {
    public static void main(String[] args) {
        String emails[] = {"test.email+alex@leetcode.com", "test.email@leetcode.com"};
        System.out.println(new UniqueMail_Easy().numUniqueEmails(emails));
    }

    public int numUniqueEmails(String[] emails) {
        HashSet<String> hs = new HashSet<>();
        for (String s:
             emails) {
            int link = s.indexOf('@');
            String domain = s.substring(link);
            s = s.substring(0, link);
            System.out.println(s);
            if (s.contains("+")) {
                int plus = s.indexOf('+');
                s = s.substring(0, plus);

            }
            System.out.println(s);
            s = s.replace(".","");
            hs.add(s+domain);
            System.out.println(hs);
        }
        return hs.size();
    }
}


/* A good solution but mine is better in terms of speed.
public int numUniqueEmails(String[] emails) {
        HashSet<String> normalized = new HashSet<>(); // used to save simplified email address, cost O(n) sapce.
        for (String email : emails) {
            String[] parts = email.split("@"); // split into local and domain parts.
            String[] local = parts[0].split("\\+"); // split local by '+'.
            normalized.add(local[0].replace(".", "") + "@" + parts[1]); // remove all '.', and concatenate '@' and domain.
        }
        return normalized.size();
    }
*/
