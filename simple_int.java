import java.lang.Math;

public class simple_int {
    public static void main(String args[]) {
        double p, r, t, si, com; // principal amount, rate, time and simple interest respectively
        p = 13000;
        r = 12;
        t = 2;
        si = (p * r * t) / 100;
        com = p * Math.pow(1.0 + r / 100.0, t) - p;
        System.out.println("Simple Interest is: " + si);
        System.out.println("Compound Interest=" + com);
    }
}