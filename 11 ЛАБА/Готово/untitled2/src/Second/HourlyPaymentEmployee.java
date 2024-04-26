package Second;

public class HourlyPaymentEmployee extends Employee {
    double hourlyRate;

    public HourlyPaymentEmployee(String id, String name, double hourlyRate) {
        this.id = id;
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double averageMonthlySalary() {
        return 20.8 * 8 * hourlyRate; // предполагая 20.8 рабочих дней и 8 часов в день
    }
}