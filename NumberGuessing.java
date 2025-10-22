
    import java.util.Scanner;
import java.util.Random;
public class NumberGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        
        for (int i = numbers.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
        
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess the first 4 numbers in the correct order.");
        System.out.println("You have 10 chances.\n");
        
        int chances = 10;
        boolean won = false;
        
        
        for (int attempt = 1; attempt <= chances; attempt++) {
            System.out.println("Attempt " + attempt + " of " + chances);
            System.out.print("Enter 4 numbers (separated by spaces): ");
            
            int[] guess = new int[4];
            for (int i = 0; i < 4; i++) {
                guess[i] = input.nextInt();
            }
            
        
            int correctCount = 0;
            for (int i = 0; i < 4; i++) {
                if (guess[i] == numbers[i]) {
                    correctCount++;
                }
            }
            
            System.out.println("Correct guesses in correct position: " + correctCount);
            
        
            if (correctCount == 4) {
                System.out.println("\nCongratulations! You guessed all 4 numbers correctly!");
                System.out.print("The numbers were: ");
                for (int i = 0; i < 4; i++) {
                    System.out.print(numbers[i] + " ");
                }
                System.out.println();
                won = true;
                break;
            }
            
            System.out.println();
        }
        
        
        if (!won) {
            System.out.println("Game Over! You've run out of chances.");
            System.out.print("The correct first 4 numbers were: ");
            for (int i = 0; i < 4; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        }
        
        input.close();
    }
}

