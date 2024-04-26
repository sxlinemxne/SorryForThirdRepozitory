import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;
public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {

        printInfo("en", "US");
        printInfo("ru", "RU");
    }
    private static void printInfo(String language, String country)
            throws UnsupportedEncodingException {
        Locale current = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("task1", current);
        for (String key : rb.keySet()) {
            String value = rb.getString(key);
            System.out.println(value);
        }
        System.out.println();
    }
}
