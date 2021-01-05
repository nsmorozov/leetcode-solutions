package recursion;

public class ReverseString {
    private static void printReverse(char [] str) {
        helper(0, str);
    }

    private static void helper(int index, char [] str) {
        if (str == null || index >= str.length) {
            return;
        }
        System.out.println("current index: " + index + " row: " + str[index]);
        helper(index + 1, str);
        System.out.print(str[index]);
    }

    public static void main(String[] args) {
        printReverse("agile".toCharArray());
    }
}