package JavaCore_6.Workers;

public class HourlyEmployee implements Salary {
    private final int SalaryForHour;

    public HourlyEmployee(int salaryForHour) {
        SalaryForHour = salaryForHour;
    }

    @Override
    public int getSalary(int numberOfHours) {
        return SalaryForHour * numberOfHours;
    }
}
