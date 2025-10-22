import java.util.Scanner;

public class AssigningGrade{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        
        int[] scores = new int[numStudents];
        char[] grades = new char[numStudents];
        
        System.out.println("Enter " + numStudents + " scores:");
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            scores[i] = input.nextInt();
        }
        
        int bestScore = scores[0];
        for (int i = 1; i < numStudents; i++) {
            if (scores[i] > bestScore) {
                bestScore = scores[i];
            }
        }
     
        for (int i = 0; i < numStudents; i++) {
            if (100 >= scores[i] && scores[i] >= 90) {
                grades[i] = 'A';
            } else if (90 >= scores[i] && scores[i] >= 80) {
                grades[i] = 'B';
            } else if (79 >= scores[i] && scores[i] >= 60) {
                grades[i] = 'C';
            } else if (59 >= scores[i] && scores[i] >= 40) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }
        
        // Display results
        System.out.println(" ");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("students score " + scores[i] +  " and grade is " + grades[i] );
        }
        
        input.close();
    }
}


    