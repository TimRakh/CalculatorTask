public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(1, 5));
        System.out.println(intsCalc.mult(11, 18));
        System.out.println(intsCalc.pow(2, 5));
    }
}