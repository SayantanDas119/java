import java.util.Scanner;
public class HollowRevTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i)-1; k++) {
                if( k == 1 || k == (2*i)-1 || i==n ) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
/* Output:
Enter the rows: 5
*********
 *     *
  *   *
   * *
    *

    */