import java.util.Scanner;

public class SeriesA {
    public static void main(String[] args) {
        // create a Scanner object
        Scanner sc = new Scanner(System.in);
        // prompt the user to enter the number of terms
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        // print the series
        System.out.print("The series is: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(10 * i + " ");
        }
        sc.close();
    }
}
// Output:
// Enter the number of terms: 3
// The series is: 10 20 30