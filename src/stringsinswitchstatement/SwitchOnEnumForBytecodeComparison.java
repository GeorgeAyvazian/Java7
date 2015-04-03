package stringsinswitchstatement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class SwitchOnEnumForBytecodeComparison {

    private enum DAYS {
        mondayLowerCase,
        tuesdayLowerCase,
        mondayUpperCase,
        tuesdayUpperCase;

        static int x = 0;
    }

    public static void main(String[] args) {
        final List<Integer> integers = new ArrayList<>(Arrays.asList(10, null));
        printThese(integers);
        final int[][] ints = new int[2][10];
        int i = 0;
        for (int[] anInt : ints) {
            System.out.println(anInt.length);
            anInt = new int[++i];
            System.out.println(anInt.length);
        }

        System.out.println(ints.length);
        final DAYS today = DAYS.tuesdayLowerCase;
        System.out.println("today is: " + today);
        switch (today) {
            case mondayLowerCase:
                System.out.println("The matching case: " + DAYS.mondayLowerCase);
                break;
            case tuesdayLowerCase:
                System.out.println("The matching case: " + DAYS.tuesdayLowerCase);
                break;
            case mondayUpperCase:
                System.out.println("The matching case: " + DAYS.mondayUpperCase);
                break;
            case tuesdayUpperCase:
                System.out.println("The matching case: " + DAYS.tuesdayUpperCase);
                break;
        }
        System.out.println("Note that with switch statements on enum values the compiler knows when all cases are covered\n" +
                "and consequently warns you that a default branch is unnecessary");
    }

    private static void printThese(List<?> integers) {
        integers.add(null);
        for (Object integer : integers) {
            System.out.println(integer);
        }
    }
}