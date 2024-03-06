import java.util.Scanner;
public class SeriesH {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        double sum = 0.0;
        for (int i = 2; i <= n; i++) {
            double num = 0.0, den = 1.0;
            for (int j = 1; j <= i; j++) {
                num += j;
                den *= j;
            }
            sum = sum + (num / den);
        }
        System.out.println("S = (1+2)/(1*2) + (1+2+3)/(1*2*3) + ... (1+2+3+...n)/(1*2*3*...*n)");
        System.out.println("S = " + sum);
        sc.close();
    }
}
// Output:
// Enter n: 5
// S = (1+2)/(1*2) + (1+2+3)/(1*2*3) + ... (1+2+3+...n)/(1*2*3*...*n)
// S = 3.0416666666666665
