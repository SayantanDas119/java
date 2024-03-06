import java.util.Scanner;  
public class HollowTrianglePattern {  
    public static void main(String[] args) {  
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the rows: ");
       int rows = sc.nextInt();  
       for (int i = 1; i <= rows ; i++) {  
         for (int j = i; j < rows ; j++) {  
           System.out.print(" ");  
         }     
         for (int k = 1; k <= (2*i -1) ; k++) {  
           if(k==1 || i == rows || k==(2*i-1)) {  
              System.out.print("*");  
           }  
           else {  
             System.out.print(" ");  
           }  
         }  
         System.out.println("");  
       } 
       sc.close(); 
    }  
}  
/* Output:
Enter the rows: 5
    *
   * *
  *   *
 *     *
*********
*/