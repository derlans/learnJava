package 多态;


public class Salary extends Employee {
    private double salary;

    public Salary(String name, String address, int number, double
            salary) {
        super(name, address, number);
        setSalary(salary);
    }
    @Override
    public void mailCheck() {
        System.out.println("salary的check ");
        System.out.println("Mailing check to " + getName()
                + " with salary " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    public double computePay() {
        System.out.println("Computing salary pay for " + getName());
        return salary / 52;
    }
}
