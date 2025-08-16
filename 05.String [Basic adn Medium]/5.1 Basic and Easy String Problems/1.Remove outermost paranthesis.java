
import java.util.Stack;

class RemoveOutermostParanthesis {

    public static String RemoveOuter(String s) {
        Stack<String> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                if (st.size() != 0) {
                    ans.append(s.charAt(i));
                }
                st.push(s.substring(i,i+1));
            } else if (s.charAt(i) == ')') {
                st.pop();
                if (st.size() != 0) {
                    ans.append(s.charAt(i));
                }
            } else {
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(RemoveOuter(s));
    }
}
