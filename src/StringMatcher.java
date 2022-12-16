public class StringMatcher {
    public static void main(String[] args) {
        System.out.println(validIP("192.168.3.56"));
    }

    public static boolean isTrueOrYes(String s) {
        return s.matches("[tT]ruel[yY]es");

    }

    public static boolean containsTrue(String s) {
        return s.matches(".*true*.");
    }

    public static boolean isThreeLetters (String s) {
        return s.matches("[a-zA-Z]{3}");
    }

    public static boolean isNoNumberAtBeginning(String s) {
        return s.matches("^[^\\d].*");
    }

    public static boolean isIntersection(String s) {
        return s.matches("([\\w&&[^b]])*");
    }

    public static boolean isLessThenThreeHundret(String s) {
        return s.matches("[^0-9]*[12]?[0-9]{1,2}[^0-9]*");

    }

    public static boolean validIP(String s) {
        return s.matches("((25[0-5]|2[0-4]\\d|[0-1]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[0-1]?\\d\\d?)");
    }


}
