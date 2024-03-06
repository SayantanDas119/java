import java.util.Scanner;
public class SeriesJ {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = in.nextInt();
        System.out.print("Enter n: ");
        int n = in.nextInt();
        double sum = 1;
        for (int i = 2; i <= n; i++) {
            double f = 1;
            for (int j = 1; j <= i; j++) {
                f *= j;
            }
            double t = ((i - 1) * x + i) / f;
            sum += t;
        }
        System.out.println("S = 1 + (x+2)/2! + (2x+3)/3! + (3x+4)/4! + ... to n terms");
        System.out.println("S = " + sum);
        in.close();
    }
}
// Output:
// Enter x: 2
// Enter n: 6
// S = 1 + (x+2)/2! + (2x+3)/3! + (3x+4)/4! + ... to n terms
// S = 4.7138888888888895