package First;

import java.util.Locale;
import java.util.ResourceBundle;
public class Main {
    public static void main(String[] args) {
        System.out.println("\nHello, here are the topics we covered in Java:");
        printInfo("en", "US");
        System.out.println("Привет вот темы которые мы прошли по джаве:");
        printInfo("ru", "RU");
    }
    private static void printInfo(String language, String country) {
        Locale current = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("task1", current);
        for (String key : rb.keySet()) {
            String value = rb.getString(key);
            System.out.println(value);
        }
        System.out.println();
    }
}

