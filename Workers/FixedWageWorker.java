package JavaCore_6.Workers;

public class FixedWageWorker implements Salary{

    private final int monthlySalary;

    public FixedWageWorker(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public int getSalary(int number) {
        return monthlySalary;
    }

}
