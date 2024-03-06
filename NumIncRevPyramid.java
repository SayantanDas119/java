    import java.util.Scanner;
    public class NumIncRevPyramid {  
       public static void main(String[] args) {  
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the rows: ");
          int rows = sc.nextInt();  
          for (int i = rows; i >= 1; i--) {  
            for (int j = 1; j <= i; j++) {  
              System.out.print(j+" ");  
           }  
           System.out.println();  
         }
         sc.close();  
       }  
   }  
// Output:
/* Enter the rows: 5
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

*/