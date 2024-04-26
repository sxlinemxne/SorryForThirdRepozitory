package Second;

public class FixedPaymentEmployee extends Employee {
    double monthlyPayment;

    public FixedPaymentEmployee(String id, String name, double monthlyPayment) {
        this.id = id;
        this.name = name;
        this.monthlyPayment = monthlyPayment;
    }

    @Override
    double averageMonthlySalary() {
        return monthlyPayment;
    }
}