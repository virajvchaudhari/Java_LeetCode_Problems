import java.util.Stack;

class StringTest{
    public static void main(String[] args) {
        System.out.println(new StringTest().removeOuterParentheses("(()())(())"));
    }

    public String removeOuterParentheses(String S) {
        char A[] = S.toCharArray();
        Stack inp = new Stack();
        int in = 0, out = 0;
        Stack val = new Stack();

        for (int i = 0; i < A.length; i++) {
            if (A[i] == '('){
                in++;
                inp.push(A[i]);
            }
            else{
                in--;
                inp.push(A[i]);
            }
            if (in == 0){

            }
        }
        System.out.println(inp);
        return S;
    }
}