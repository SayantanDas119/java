import java.util.Scanner;
public class SeriesI {
	static int factSum(int n) {
		int f = 1, Sum = 0;
		for (int i = 1; i <= n; i++) {
			f = f * i;
			Sum += f;
		}
		return Sum;
	}
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    System.out.print("Enter n term: ");
		int n = sc.nextInt();
		System.out.println("S = 1! + 2! + 3! + ... + n!");
		System.out.print("S = " + factSum(n));
		sc.close();
	}
}
// Output:
// Enter n term: 5
// S = 1! + 2! + 3! + ... + n!
// S = 153