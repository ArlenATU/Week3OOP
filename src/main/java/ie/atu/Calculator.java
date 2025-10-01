package ie.atu;

public class Calculator {
    public int add(int a,int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int dividing(int a, int b) {
        return a / b;
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public int modulo(int a, int b) {
        return a % b;
    }
}
