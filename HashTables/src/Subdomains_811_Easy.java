import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Subdomains_811_Easy {
    public static void main(String[] args) {
        String A[] = {"9001 discuss.leetcode.com", "200 magic.com"};
        new Subdomains_811_Easy().subdomainVisits(A);
    }

    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> counts = new HashMap();
        for (String domain: cpdomains) {
            String[] cpinfo = domain.split("\\s+");

            String[] frags = cpinfo[1].split("\\.");



            int count = Integer.valueOf(cpinfo[0]);
            String cur = "";
            for (int i = frags.length - 1; i >= 0; --i) {
                cur = frags[i] + (i < frags.length - 1 ? "." : "") + cur;
                counts.put(cur, counts.getOrDefault(cur, 0) + count);
            }
            System.out.println(counts);
        }



        List<String> ans = new ArrayList();
        for (String dom: counts.keySet()){
            ans.add("" + counts.get(dom) + " " + dom);
        }
        return ans;
    }
}































//        while (!(domain.indexOf(".") == -1)) {
//            if (!countDomain.containsKey(domain)) {
//                countDomain.put(domain, count);
//                domain = domain.substring(domain.indexOf(".") + 1, domain.length());
//            } else {
//                countDomain.put(domain, count);
//                domain = domain.substring(domain.indexOf(".") + 1, domain.length());
//            }
//        }
//
//        if (!countDomain.containsValue(domain))
//            countDomain.put(domain, count);
//        else
//            countDomain.put(domain, +count);
//
//        System.out.println(countDomain);





//for (String el :
//        cpdomains) {
//        System.out.println(el);
//        cpdomains = el.split("\\s");
//        result.add(cpdomains[0]);
//        }
//        System.out.println(result.toString());
//        for (String val : cpdomains)
//        {
//        int count = Integer.parseInt(cpdomains[0]);
//        String domain = cpdomains[1];
//        }
//        System.out.println(countDomain);



//class Solution {
//    public List<String> subdomainVisits(String[] cpdomains) {
//        Map<String, Integer> counts = new HashMap();
//        for (String domain: cpdomains) {
//            System.out.println(domain);
//            String[] cpinfo = domain.split("\\s+");
//            System.out.println(cpinfo);
//            String[] frags = cpinfo[1].split("\\.");
//            int count = Integer.valueOf(cpinfo[0]);
//            String cur = "";
//            for (int i = frags.length - 1; i >= 0; --i) {
//                cur = frags[i] + (i < frags.length - 1 ? "." : "") + cur;
//                counts.put(cur, counts.getOrDefault(cur, 0) + count);
//            }
//        }
//
//        List<String> ans = new ArrayList();
//        for (String dom: counts.keySet())
//            ans.add("" + counts.get(dom) + " " + dom);
//        return ans;
//    }
//}