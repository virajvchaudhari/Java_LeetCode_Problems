import java.math.BigInteger;

public class AddBinary_Easy_67 {
    public static void main(String[] args) {
        System.out.println(new AddBinary_Easy_67().addBinary(
                "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }

    /**
     *  This method works only for small numbers.
     */
    /*public String addBinary(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a,2) + Integer.parseInt(b,2));
    }*/

//    public String addBinary(String a, String b) {
//        BigInteger result = new BigInteger(a,2).add(new BigInteger(b,2));
//        return result.toString(2);
//    }

    public String addBinary(String a, String b){
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        while (i >= 0 || j >= 0) {
//          initializing value of the sum to carry.
            int sum = carry;
//          Checking the last character and adding it to the sum variable.
            if (j >= 0) sum += b.charAt(j--) - '0';
//          Further adding up the sum variable value.
            if (i >= 0) sum += a.charAt(i--) - '0';

//          Appending the modulus value: if value comes out either be 0 or 1.
            sb.append(sum % 2);
/*
          Dividing the carry variable by 2: which results in either a value divisible
            by 2 in most cases 0, or value comes out to be one which is further passed
            on to be carry variable value.
*/
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
/*
"11101000101011001000011011000001100011110011010010011000000000"
"11101000101011001000011011000001100011110011010010011000000000"
"110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000"
*/

/*





"10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
        "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"*/
