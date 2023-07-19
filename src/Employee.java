public class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    public Employee(String name, String birthDate, String endDate, long employeeId, String hireDate) {
        super(name, birthDate, endDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return super.toString() + " empId : " + employeeId + " hireDate : " + hireDate;
    }
}
