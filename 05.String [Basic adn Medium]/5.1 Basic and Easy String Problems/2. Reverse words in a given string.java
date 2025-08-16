
class ReverseWordsInAGivenString {

    public static String reverseWords(String s) {

        StringBuilder word = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (word.length()>0) {
                    ans.append(word.reverse()+" ");
                }
                word.delete(0, word.length());
            }else{
                word.append(s.charAt(i));
            }
        }
        ans.append(word.reverse());
        return ans.toString().trim();
    }

    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
        
    }
}
