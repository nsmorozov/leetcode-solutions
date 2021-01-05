package recursion;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(calculate(1));
    }

    private static long calculate(int i) {
        if(i == 0 || i == 1) return 1;
        return i * calculate(i - 1);
    }
}
