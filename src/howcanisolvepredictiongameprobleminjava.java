import java.util.Scanner;

public class howcanisolvepredictiongameprobleminjava {
    public static void main(String[] args) {
    /**
     * Original post
     * 0


        step1:The user must guess a number eg:2

        step2:The guessed number should be multiplied by 2 eg:2*2=4

        step3:The program should give a random number in the multiples of 10 max 50 and should insist the user to add the number with the above answer eg:4+10=14

        step4:The above answer should be cut off by half or divided by 2 to make it half eg:14/2=7 or half value of 14 is 7 likewise

        step5:Now the program should take half of the value added from step 3 and subtract it from the above answer eg:At step3 the number provide by the program is 10(ie)Now it should take the half of 10 and subtract it from the above answer 7 -5=2. Therefore the user guessed number was 2 and we got the answer...

        Hence if there any programmers can write a code for this using java please send it to me eventhough i wrote the programs but it turns out to show some errors in declaring variables and using multiple operations using operators so i got stuck so plz send codes\
     */
    p("enter an integer number");
    Scanner s = new Scanner(System.in);
    String userInput = s.next();


    }
    public static void p(Object object_to_print) {
        System.out.println(object_to_print);
    }
}
