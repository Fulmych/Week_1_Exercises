package application;
import java.util.Random;
import java.util.Scanner;
public class Exercise8 {
    public static void main(String[] args) {
        Random Numb = new Random();
        int upperbound = 499;
        int int_random = Numb.nextInt(upperbound+1);
        Scanner chosenNumber = new Scanner(System.in);
        System.out.println("Please guess the random number between 1 and 500.");
        int amountOfTries = 0;
        int numb = chosenNumber.nextInt();
        amountOfTries++;
        while (numb != int_random){
            if (numb < int_random){
                amountOfTries++;
                System.out.println("You guessed to small.\nTry again.");
                numb = chosenNumber.nextInt();
            } else if (numb > int_random){
                amountOfTries++;
                System.out.println("You guessed to big.\nTry again.");
                numb = chosenNumber.nextInt();
            }
        }
        System.out.println("Congratulations, you guessed the right number.\nThe amount of tries was " + amountOfTries + ".");
    }
}