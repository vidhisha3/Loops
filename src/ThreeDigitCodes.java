public class ThreeDigitCodes {
    public static void main(String[] args) {
        //declaring the int variable as code
        int code = 0;

        //using for nested loop three times
     for(int i =1; i <=4; i++){
         for(int j=1; j <= 4; j++){
             for(int k =1; k<= 4; k++){
                 if (k !=i && k != j && i != j){

                     //declaring the statement for loops
                     code++;
                     //output
                     System.out.println(i + "" + j +"" + k);
                 }
             }
         }
     }
     //declaring the code to print to output
     System.out.println("Total Number of possibilty of the Three-digit-number is " + code);
    }
}
