package MyUtils;

public class stringUtils {
    public static String getOrdinal(int number) {
        int remainder10 = number % 10;
        int remainder100 = number % 100;
        if (remainder10 == 1 && remainder100 != 11) {
            return STR."\{number}st";
        } else if (remainder10 == 2 && remainder100 != 12) {
            return STR."\{number}nd";
        } else if (remainder10 == 3 && remainder100 != 13) {
            return STR."\{number}rd";
        } else {
            return STR."\{number}th";
        }
    }
    public static boolean isValidName(String name) {
        return name.matches("[a-zA-Z\\s]+");
    }
}
