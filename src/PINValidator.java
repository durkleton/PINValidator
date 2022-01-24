import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PINValidator {
    private static String regex = "^[0-9]{4,6}$";
    private String pin;
     
    public PINValidator(String pin) {
        this.pin = pin;
    }

    public boolean validate(){
        Pattern pattern = Pattern.compile(regex);
        // Just in case there's some kind of Null Pointer Exception
        if (pin == null)
            return false;
        // Using Pattern and Matcher to check the regex
        Matcher match = pattern.matcher(pin);
        return match.matches();
    }

    public static String getRegex() {
        return regex;
    }

    public static void setRegex(String regex) {
        PINValidator.regex = regex;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

}
