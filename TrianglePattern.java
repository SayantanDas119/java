import java.util.Scanner;
public class TrianglePattern {    
  public static void main(String args[]) {    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the rows: ");
    int row = sc.nextInt();       
    for (int i=0; i<row; i++) { 
       for (int j=row-i; j>1; j--) {  
         System.out.print(" ");   
       }   
       for (int j=0; j<=i; j++) {  
          System.out.print("* ");   
       }   
       System.out.println();   
    }   
    sc.close();
  }   
}  
/* Output:
Enter the rows: 6
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
* * * * * * 

*/