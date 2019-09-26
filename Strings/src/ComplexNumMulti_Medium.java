//import java.util.ArrayList;
//import java.util.InputMismatchException;
//
//public class ComplexNumMulti_Medium {
//    public static void main(String[] args) {
//        System.out.println(new ComplexNumMulti_Medium().complexNumberMultiply("1+1i", "1+1i"));
//    }
//
//    public static boolean isInteger(String s) {
//        try {
//            Integer.parseInt(s);
//        } catch (NumberFormatException e) {
//            return false;
//        }
//        return true;
//    }
//
//    public String complexNumberMultiply(String a, String b) {
//        String[] first = a.split("\\+");
//        String[] second = b.split("\\+");
//        ArrayList<String> res = new ArrayList<>();
//
//        for (int i = 0; i < first.length; i++) {
//            for (int j = 0; j < second.length; j++) {
//                if (isInteger(first[i]) && isInteger(second[j])) {
//                    res.add(Integer.toString(Integer.parseInt(first[i]) * Integer.parseInt(second[j])));
//
//                } else if (isInteger(first[i]) && !isInteger(second[j])) {
//
//                    if (second[j].contains("-")){
//                        String temp = "-" + second[j].substring(0,1);
//                    }else{
//                    String temp = second[j].substring(0,1);
//                    }
//                    res.add((Integer.parseInt(first[i]) * Integer.parseInt(temp)) + "i");
//
//                } else if (!isInteger(first[i]) && isInteger(second[j])) {
//                    String temp = first[i].substring(0,1);
//                    res.add((Integer.parseInt(second[j]) * Integer.parseInt(temp))+ "i");
//
//                } else {
//                    res.add("-" + (Integer.parseInt(first[i].substring(0,1)) * Integer.parseInt(second[j].substring(0,1))));
//                }
//            }
//        }
//        int sum1 = 0;
//        int sum2 = 0;
//        for (String el:
//                res) {
//            if (isInteger(el))
//                sum1 += Integer.parseInt(el);
//            else {
//                sum2 += Integer.parseInt(el.substring(0,1));
//            }
//        }
//        return (sum1 + "+" + sum2 + "i");
//    }
//}
