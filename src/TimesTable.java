import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
       // asking the user to input the number which they want to timestable
        System.out.println("What Times Table would you like? : ");

        int timesTable = reader.nextInt();
        //using For Loop
        for (int i=1; i<=12;i++){
            System.out.println(timesTable + "X" + i + "=" + timesTable * i);
        }


    }
}
