public class Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.gorjeta = 0.05;
        calc.encontreTotal();
    }

    public double gorjeta = 0.15;
    public int originalPrice;
    public void printGorjeta() {
        System.out.println(gorjeta);
    }
}
