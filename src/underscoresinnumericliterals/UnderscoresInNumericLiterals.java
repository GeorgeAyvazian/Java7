package underscoresinnumericliterals;

public final class UnderscoresInNumericLiterals {

    public static void main(String... args) {
        final int x = 1_0;
        System.out.println("x initialized as '1_0': " + x);

        final double y = 3.14_18d;
        System.out.println("y initialized as '3.14_18d (there must be numbers on either side of the underscore)': " + y);

        final long z = 0xFF_FF_FF_FF_FF_FF_FF_FFL;
        System.out.println("z initialized as '0xFF_FF_FF_FF_FF_FF_FF_FFL (-1)': " + z);
    }
}
