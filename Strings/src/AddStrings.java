public class AddStrings {
    public static void main(String[] args) {
        System.out.println(new AddStrings().addStrings("1",
                "1"));
    }

    public String addStrings(String num1, String num2) {
        char ch[] = num1.toCharArray();
        int sum = 0;
        //get ascii value for zero
        int zeroAscii = (int)'0';
        for(char c:ch){
            int tmpAscii = (int)c;
            sum = (sum*10)+(tmpAscii-zeroAscii);
        }
        return Integer.toString(sum);
    }
}
