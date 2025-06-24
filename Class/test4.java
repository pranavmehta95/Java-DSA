package Class;
interface iCalculator{
    void add(int a, int b);
    void subtract(int a, int b);
    void multiply(int a, int b);
    void divide(int a, int b);
}
class CalculatorImpl implements iCalculator{
    public void add(int a, int b){
        System.out.println("The sum is : "+(a+b));
    }
    public void subtract(int a, int b){
        System.out.println("The difference is : "+(a-b));
    }
    public void multiply(int a, int b){
        System.out.println("The product is : "+(a*b));
    }
    public void divide(int a, int b){
        System.out.println("The divide is : "+(a/b));
    }
}

public class test4 {
    public static void main(String[] args) {
        // Lopse coupling : polymorphism
        iCalculator calculator = new CalculatorImpl();
        calculator.add(12,13);
        calculator.subtract(80,56);
        calculator.multiply(12,13);
        calculator.divide(12,13);

    }
}
