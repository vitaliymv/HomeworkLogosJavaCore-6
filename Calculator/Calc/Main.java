package JavaCore_6.Calculator.Calc;

public class Main {

    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        System.out.println(myCalculator.add(3, 8));
        System.out.println(myCalculator.div(9, 5));
        System.out.println(myCalculator.multi(4, 7));
        System.out.println(myCalculator.subtract(5, 2));
    }
}
