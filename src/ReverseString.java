import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // applying the scanner
        Scanner reader = new Scanner(System.in);
        System.out.println("Input a String:");
        //declaring the char the letters
        char[] letters = reader.nextLine().toCharArray();
        // using the for loop where i = letterslength
        for (int i = letters.length - 1; i >=0; i--)
            //printing the output
        System.out.print(letters[i]);
    }
}
