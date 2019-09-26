public class Defang_IP_Easy_1108 {
    public static void main(String[] args) {
        new Defang_IP_Easy_1108().defangIPaddr("255.100.50.0");
    }

    public String defangIPaddr(String address) {
        String result = "";

        for (String val : address.split("[.]")) {
            result = result.concat(val+ "[.]");
        }

        return result.substring(0,result.length()-3);
    }
}

// Better solution in terms of addressing the issue but complexity obtained is same.

//return address.replace(".", "[.]");