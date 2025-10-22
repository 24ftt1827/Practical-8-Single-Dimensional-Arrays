import java.util.Scanner;
public class  ShiftingElementbyInput {
public static void main(String[] args){

    int numbers[];
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many numbers are there?");
    int n = scanner.nextInt();
    numbers = new int[n];   

    System.out.println("Enter the numbers:");
    for(int i=0; i<n; i++){
        numbers[i] = scanner.nextInt();
    }

    System.out.print("Enter number of left shift:\n");
        int shift = scanner.nextInt();

        // Normalize shift (in case shift > n)
        shift = shift % n;
        
        // Perform left shift
        int[] shifted = new int[n];
        for (int i = 0; i < n; i++) {
            shifted[i] = numbers[(i + shift) % n];
        }
        
        // Display shifted arrangement
        System.out.println("The shifted arrangement is:");
        for (int i = 0; i < n; i++) {
            System.out.print(shifted[i] + " ");
        }
        
        scanner.close();
}
}
