package JavaCore_6.Workers;

public class Main {

    public static void main(String[] args) {

        FixedWageWorker fixedWageWorker = new FixedWageWorker(8000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee(50);
        System.out.println("Fixed-wage worker earned: " + fixedWageWorker.getSalary(1) + "$");
        System.out.println("Hourly employee earned: " + hourlyEmployee.getSalary(300) + "$");

    }
}
