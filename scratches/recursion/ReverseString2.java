package recursion;

public class ReverseString2 {

    private static char[] reverse(char[] s, int index) {
        char temp;
        if (index == s.length/2) return s;
        temp = s[index];
        s[index] = s[s.length - index - 1];
        s[s.length - index - 1] = temp;
        return reverse(s, index + 1);

    }

    public static void main(String[] args) {
        char[] s = reverse("abcde".toCharArray(), 0);
        System.out.println(s);
    }
}
