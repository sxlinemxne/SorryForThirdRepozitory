abstract class Employee {
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) throws OkladException {
        this.name = name;
        this.position = position;
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) throws OkladException {
        if (salary < 0) {
            throw new OkladException("Невозможно создать сотрудника – указан отрицательный оклад: " + salary);
        }
        this.salary = salary;
    }

    public abstract double calculateSalary();
}

class Department {
    private String name;
    private int employeeCount;

    public Department(String name, int employeeCount) {
        this.name = name;
        this.employeeCount = employeeCount;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }
}

class Firm {
    private String name;

    public Firm(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            RegularEmployee regularEmployee = new RegularEmployee("Адриан Носко", "Developer", 66666, 1122);
            System.out.println("Имя штатного сотрудника: " + regularEmployee.getName());
            System.out.println("Зарплата штатного сотрудника: " + regularEmployee.calculateSalary());
            ContractEmployee contractEmployee = new ContractEmployee("Петр Петров", "Manager", 77777);
            System.out.println("Имя сотрудника по контракту: " + contractEmployee.getName());
            System.out.println("Зарплата сотрудника по контракту: " + contractEmployee.calculateSalary());
        } catch (OkladException | PremiyaException e) {
            System.out.println(e.getMessage());
        }
    }
}
