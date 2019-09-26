import java.util.*;

public class Subdomains_Tru {
    public static void main(String[] args) {
        String A[] = {"9001  discuss.leetcode.com", "200 magic.com"};
        List<String> res = new ArrayList<>();
        res = new Subdomains_Tru().subdomainVisits(A);
        System.out.println(res);
    }

    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer> counts = new HashMap<>();

        for (String domains : cpdomains) {
//            Splitted the cpdomains strings on the basis of the space.
            String cpinfo[]= domains.split("\\s+");

//            Splited the next part after the count on the basis of the dot.
            String frags[] = cpinfo[1].split("\\.");

            int count = Integer.valueOf(cpinfo[0]);

            String curr = "";

            for (int i = frags.length - 1; i >= 0; --i) {
                curr = frags[i] + (i < frags.length - 1 ? "." : "") + curr;
                counts.put(curr, counts.getOrDefault(curr,0) + count);
            }
        }

        List<String> result = new ArrayList<>();
        for (String dom:counts.keySet()) {
            result.add("" + counts.get(dom) + " " + dom);
        }

        return result;
    }
}
