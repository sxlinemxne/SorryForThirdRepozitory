
package Second;

        import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        FixedPaymentEmployee employee1 = new FixedPaymentEmployee("1", "Ivan", 1000);
        employees.add(employee1);

        HourlyPaymentEmployee employee2 = new HourlyPaymentEmployee("2", "Maria", 20);
        employees.add(employee2);

        FixedPaymentEmployee employee3 = new FixedPaymentEmployee("3", "Alex", 1200);
        employees.add(employee3);

        HourlyPaymentEmployee employee4 = new HourlyPaymentEmployee("4", "Anna", 22);
        employees.add(employee4);

        FixedPaymentEmployee employee5 = new FixedPaymentEmployee("5", "Sergey", 1100);
        employees.add(employee5);

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                int salaryCompare = Double.compare(e2.averageMonthlySalary(), e1.averageMonthlySalary());
                if (salaryCompare != 0) {
                    return salaryCompare;
                } else {
                    return e1.name.compareTo(e2.name);
                }
            }
        });

        double exchangeRate = 91.10;
        System.out.println("\nИнформация о сотрудниках на русском языке:");
        FullReport reportRU = new FullReport(new Locale("ru", "RU"), exchangeRate, "RUB");
        reportRU.printReport(employees);

        exchangeRate = 1 / exchangeRate;
        System.out.println("Information about employees in English:");
        FullReport reportEN = new FullReport(new Locale("en", "US"), exchangeRate, "USD");
        reportEN.printReport(employees);
    }
}