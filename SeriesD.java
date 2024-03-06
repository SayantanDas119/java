import java.util.Scanner;
public class SeriesD {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= 10; i++)
            sum += Math.pow(a, i) / i;
        System.out.println("S = a + a2/2 + a3/3 + ... + a10/10");    
        System.out.println("S = " + sum);
        sc.close();
    }
}
// Output:
// Enter a: 3
// S = a + a2/2 + a3/3 + ... + a10/10
// S = 9431.30357142857 