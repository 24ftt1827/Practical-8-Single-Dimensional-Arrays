public class PrintingAlternatingAlphabet {
    public static void main(String[] args) {
           String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", 
                             "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", 
                             "u", "v", "w", "x", "y", "z"};
        for (int i = 0, j = 25; i < 26; i++, j--) {
            System.out.print(alphabet[i]  + alphabet[j]);
        }
    }
}
