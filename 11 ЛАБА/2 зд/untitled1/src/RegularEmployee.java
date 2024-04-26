public class RegularEmployee extends Employee {
    private double bonus;

    public RegularEmployee(String name, String position, double salary, double bonus) throws OkladException, PremiyaException {
        super(name, position, salary);
        setBonus(bonus);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) throws PremiyaException {
        if (bonus < 0) {
            throw new PremiyaException("Премия не может быть отрицательной: " + bonus);
        }
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        try {
            if (bonus < 0) {
                throw new PremiyaException("Премия не может быть отрицательной: " + bonus);
            }
            return getSalary() + bonus;
        } catch (PremiyaException e) {
            System.out.println(e.getMessage());
            return getSalary();
        }
    }
}
