import java.util.Scanner;
import java.lang.Math;

public class GuessingNumGame {
  public static void main(String[] args) {
    int answer = (int) (Math.random() * 100) + 1;
    int k = 3;
    Scanner input = new Scanner(System.in);
    boolean correct = false;
    System.out.println("A number is chosen between 1 to 100. \nGuess the number within 3 trials.");
    while (k > 0) {
      System.out.print("Guess the number: ");
      int guess = input.nextInt();
      if (guess == answer) {
        System.out.println("You have guessed correctly!");
        break;
      } else if (guess > answer) {
        System.out
            .println("The number is less than " + guess + "\nWrong guess, you have " + (k - 1) + " chances left.");
        k--;
      } else if (guess < answer) {
        System.out
            .println("The number is greater than " + guess + "\nWrong guess, you have " + (k - 1) + " chances left.");
        k--;
      }
    }
    if (correct == false) {
      System.out.println("The number was " + answer);
      System.out.println("Play again ...");
    }
    input.close();
  }
}
/*
 * Output:
 * A number is chosen between 1 to 100.
 * Guess the number within 3 trials.
 * Guess the number: 94
 * The number is less than 94
 * Wrong guess, you have 2 chances left.
 * Guess the number: 35
 * The number is less than 35
 * Wrong guess, you have 1 chances left.
 * Guess the number: 14
 * The number is greater than 14
 * Wrong guess, you have 0 chances left.
 * The number was 32
 * Play again ...
 * 
 */