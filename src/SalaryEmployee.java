public class SalaryEmployee extends Employee {
    private double annualSalary;
    private boolean isReteired;

    public SalaryEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate, double annualSalary, boolean isReteired) {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isReteired = isReteired;
    }

    public void retire() {
        this.isReteired = true;
    }

    @Override
    public String toString() {
        return super.toString() +  " SalaryEmployee{" +
                "annualSalary=" + annualSalary +
                ", isReteired=" + isReteired +
                '}';
    }
}
