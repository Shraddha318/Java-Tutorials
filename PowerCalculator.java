public class PowerCalculator {
    static int power(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++)
            result *= base;
        return result;}
    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;
        System.out.println("Result: " + power(base, exponent));
    }
}
