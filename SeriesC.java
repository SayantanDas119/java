import java.util.Scanner;
public class SeriesC {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= 10; i++)
            sum += Math.pow(a, 2) / i;
        System.out.println("S = a2 + a2/2 + a2/3 + ... + a2/10");    
        System.out.println("S = " + sum);
        sc.close();
    }
}
// Output:
// Enter a: 5
// S = a2 + a2/2 + a2/3 + ... + a2/10
// S = 73.22420634920634