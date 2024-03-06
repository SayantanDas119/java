import java.util.Scanner;
public class PascalTriangle {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the rows: ");
      int row = sc.nextInt();
      for(int i=0; i<row; i++) {
         for(int space=row; space>i; space--) {
            System.out.print(" ");
         }
         int num=1;
         for(int j=0; j<=i; j++) {
            System.out.print(num+ " ");
            num = num*(i-j)/(j+1);
         }
         System.out.print("\n");
      }
      sc.close();
   }
}
// Output:
/* Enter the rows: 5
     1 
    1 1 
   1 2 1 
  1 3 3 1 
 1 4 6 4 1 

 */