import java.util.Scanner;
class DiamondPattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size: ");
    int size = sc.nextInt();
    for (int i = 1; i <= size; i++) {
      for (int j = size; j > i; j--) {
        System.out.print(" ");
      }
      for (int k = 0; k < i * 2 - 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = 1; i <= size - 1; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int k = (size - i) * 2 - 1; k > 0; k--) {
        System.out.print("*");
      }
      System.out.println();
    }
    sc.close();
  }
}
/* Output: 
Enter the size: 5
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

*/