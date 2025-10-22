
    import java.util.Scanner;

    public class EliminateDuplicate{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        int[] numbers = new int[10];
        System.out.println("Enter 10 numbers between 1-9:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) );
            numbers[i] = input.nextInt();
        }
        
        
        int[] distinct = new int[10];
        int count = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicate = false;
            
            
            for (int j = 0; j < count; j++) {
                if (numbers[i] == distinct[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                distinct[count] = numbers[i];
                count++;
            }
        }
        
        
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (distinct[j] > distinct[j + 1]) {
                    
                    int temp = distinct[j];
                    distinct[j] = distinct[j + 1];
                    distinct[j + 1] = temp;
                }
            }
        }
        
        
        System.out.println("\nThe distinct numbers in ascending order are:");
        for (int i = 0; i < count; i++) {
            System.out.print(distinct[i] + " ");
        }
        System.out.println();
        
        input.close();
    }
}

