import java.util.Scanner;
public class RhombusPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows: ");
		int row = sc.nextInt();
        System.out.print("Enter cols: ");
		int col = sc.nextInt();
		for (int i=1; i<= row; i++) {
			for (int j=1 ; j<=i ; j++)  
				System.out.print(" ");
			for (int j=1 ; j<=col; j++) 
				System.out.print("*");
			System.out.println();
		}
		sc.close();
	}
}
// Output:
/* Enter rows: 5
   Enter cols: 4
****
  ****
   ****
    ****
     ****
*/