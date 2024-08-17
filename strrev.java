
public class strrev {
    public static String reverseString(String str) {
        char[] ch = str.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }
        return rev;
    }

    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseString(original);
        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);
    }
}

