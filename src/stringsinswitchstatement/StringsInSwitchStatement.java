package stringsinswitchstatement;

public final class StringsInSwitchStatement {
    private static final String mondayLowerCase = "monday";
    private static final String tuesdayLowerCase = "tuesday";

    private static final String mondayUpperCase = "MONDAY";
    private static final String tuesdayUpperCase = "TUESDAY";

    public static void main(String[] args) {
        final String today = tuesdayUpperCase;
        System.out.println("today is: " + today);
        switch (today) {
            case mondayLowerCase:
                System.out.println("The matching case in the switch statement on the string is: " + mondayLowerCase);
                break;
            case tuesdayLowerCase:
                System.out.println("The matching case in the switch statement on the string is: " + tuesdayLowerCase);
                break;
            case mondayUpperCase:
                System.out.println("The matching case in the switch statement on the string is: " + mondayUpperCase);
                break;
            case tuesdayUpperCase:
                System.out.println("The matching case in the switch statement on the string is: " + tuesdayUpperCase);
                break;
            default:
                break;
        }
        System.out.println("The switch statement on strings is case sensitive");

    }
}
