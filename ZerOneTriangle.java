import java.util.Scanner;
class ZerOneTriangle {
  public static void main(String args[]) {
   
   Scanner scan=new Scanner(System.in);
   System.out.print("Enter the number of rows: ");
   int rows=scan.nextInt();
   for(int i=1; i<=rows; i++) {
     for(int j=1; j<=i; j++) {
       if((i+j)%2==1) {
         System.out.print("0");
       }
       else {
         System.out.print("1");
       }
     }
     System.out.println();
    }
    scan.close();
  }
}