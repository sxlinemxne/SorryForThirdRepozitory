public class ContractEmployee extends Employee {

    public ContractEmployee(String name, String position, double salary) throws OkladException {
        super(name, position, salary);
    }

    @Override
    public double calculateSalary() {
        try {
            return getSalary();
        } catch (Exception e) {
            System.out.println("Ошибка при расчете зарплаты: " + e.getMessage());
            return 0;
        }
    }
}
