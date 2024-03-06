import java.util.Scanner;
public class NumChngPyramid  {              
    public static void main(String[] args) {  
      int k = 1;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the rows: ");
      int n = sc.nextInt();    
      for (int i = 1; i <= n; i++) {   
         for (int j = 1; j< i + 1; j++) {  
           System.out.print(k++ + " ");  
         }   
         System.out.println();  
       }  
       sc.close();
    }  
}  
// Output:
/* Enter the rows: 5
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
*/