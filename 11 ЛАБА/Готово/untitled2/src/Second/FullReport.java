package Second;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

class FullReport {
    private Locale locale;
    private double exchangeRate;
    private String currencySymbol;

    public FullReport(Locale locale, double exchangeRate, String currencySymbol) {
        this.locale = locale;
        this.exchangeRate = exchangeRate;
        this.currencySymbol = currencySymbol;
    }

    public void printReport(List<Employee> employees) {
        ResourceBundle bundle = ResourceBundle.getBundle("task2", locale);
        String title = bundle.getString("title");
        System.out.println(title);

        NumberFormat formatter = NumberFormat.getInstance(locale);

        for (Employee employee : employees) {
            double salaryInLocalCurrency = employee.averageMonthlySalary() * exchangeRate;
            System.out.println(bundle.getString("name") + " " + employee.name);
            System.out.println(bundle.getString("id") + " " + employee.id);
            System.out.println(bundle.getString("salary") + " " + formatter.format(salaryInLocalCurrency) + " " + currencySymbol);
            System.out.println();
        }
    }
}