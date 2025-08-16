
class LargestOddNumber {

    public static String LargestOdd(String num) {

        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(num.length() - 1 - i) % 2 != 0) {
                return num.substring(0, num.length() - i);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String s = "7542351161";
        System.out.println(LargestOdd(s));
    }
}
