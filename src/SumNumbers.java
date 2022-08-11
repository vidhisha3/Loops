import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String sumTo = "";
        boolean isNumber = true;
        int num = 0;

        while (isNumber) {
            System.out.print("Input a number to sum to: ");
            sumTo = reader.nextLine();

            try {
                num = Integer.parseInt(sumTo);
                isNumber = true;
            } catch (NumberFormatException e) {
                isNumber = false;
                break;
            }

            int i = 1;
            int sumTotal = 0;

            while (i <= num) {
                sumTotal += i;
                i++;
            }

            System.out.println(sumTotal);

        }
    }
}
