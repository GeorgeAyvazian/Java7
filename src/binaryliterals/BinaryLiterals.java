package binaryliterals;

public final class BinaryLiterals {

    public static void main(String... args) {
        System.out.println("Decimal Version of the numeral 'ten': x = 10");
        System.out.println("Binary Version of the numeral 'ten': x_bin = 0b1010");

        final short x_bin = 0b1010;
        final int x = 10;
        System.out.println("Different representations of the same numeral => x == x_bin?: " + (x == x_bin));
    }
}
