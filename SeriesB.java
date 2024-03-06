import java.util.Scanner;
public class SeriesB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        System.out.print("The series is: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i * i + " ");
        }
        sc.close();
    }
}
// Output: 
// Enter the number of terms: 5
// The series is: 1 4 9 16 25