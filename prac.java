import java.util.Scanner;

public class prac {
    public static void main(String[] args) {
        String name, blood;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name=");
        name = sc.nextLine();
        System.out.println("Enter the age=");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the blood group=");
        blood = sc.nextLine();
        if (age < 10) {
            System.out.println("The groups are");
            System.out.println("A");
        } else if (age < 15) {
            System.out.println("The groups are");
            System.out.println("B");
        } else {
            System.out.println("The groups are");
            System.out.println("C");
        }
    }
}