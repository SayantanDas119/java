    import java.util.Scanner;
    public class LeftHfPyramid {    
       public static void main(String args[]) {    
          int i, j;
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the rows: ");
          int row = sc.nextInt();       
          for (i=0; i<row; i++) {  
            for (j=2*(row-i); j>=0; j--) {  
              System.out.print(" ");   
           }   
           for (j=0; j<=i; j++ ) {   
             System.out.print("* ");   
           }   
           System.out.println();   
          }   
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