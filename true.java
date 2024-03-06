class Main {

    public static void main(String[] args) {
        String digit_string1 = "131";
        String digit_string2 = "112z";
        System.out.println("First string:");
        System.out.println(digit_string1);
        boolean result1 = test_only_digits(digit_string1);
        System.out.println(result1);
        System.out.println("\nSecond string:");
        System.out.println(digit_string2);
        boolean result2 = test_only_digits(digit_string2);
        System.out.println(result2);
    }

    public static boolean test_only_digits(String digit_string) {
        for (int i = 0; i < digit_string.length(); i++) {
            if (!Character.isDigit(digit_string.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
