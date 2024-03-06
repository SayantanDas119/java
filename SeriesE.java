import java.util.Scanner;
public class SeriesE {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        double sum = 0;
        int a = 1;
        for (int i = 1, j = 1; i <= n; i++, j+=2) {
            double term = Math.pow(x, i) / j * a;
            sum += term;
            a *= -1;
        }
        System.out.println("S = x - x2/3 + x3/5 - x4/7 + ... to n terms");
        System.out.println("S = " + sum);
        sc.close();
    }
}
// Output: Enter x: 6
// Enter n: 3
// S = x - x2/3 + x3/5 - x4/7 + ... to n terms
// S = 37.2