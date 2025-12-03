/*
250541621
nedim isa
03.12.2025
*/
public class Multadd {

    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    public static double expSum(double x) {
        return (x * Math.exp(-x)) + Math.sqrt(1 - Math.exp(-x));
    }

    public static void main(String[] args) {

        System.out.println(multadd(1, 2, 3)); // test

        // sin(π/4) + cos(π/4)/2
        double expr1 = multadd(Math.sin(Math.PI / 4), 1, Math.cos(Math.PI / 4) / 2);
        System.out.println("Expression 1 = " + expr1);

        // log 10 + log 20
        double expr2 = multadd(Math.log(10), 1, Math.log(20));
        System.out.println("Expression 2 = " + expr2);

        // expSum(x)
        System.out.println("expSum(5) = " + expSum(5));
    }
}
