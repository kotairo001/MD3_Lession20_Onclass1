import java.util.regex.Pattern;

public class Main {
    public static final String VALIDATE_REGEX = "[CAP][\\d]{4}[GHIKLM]";
    public static void main(String[] args) {
        boolean validatedClass = Pattern.matches(VALIDATE_REGEX,"C0318G");
        System.out.println(validatedClass);

    }
}
