import java.util.Scanner;
public class SquareFillPattern {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the length of a side: ");
      int len = sc.nextInt();
      System.out.println("The square fill pattern: ");
      for(int i = 1; i <= len; i++) {
         for(int j = 1; j <= len; j++) {
            System.out.print("*");
         }
         System.out.print("\n");
      }
      sc.close();
   }
}
/* Output:
Enter the length of a side: 6
The square fill pattern: 
******
******
******
******
******
******

*/