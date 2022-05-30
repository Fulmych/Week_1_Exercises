package application;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        int year;
        boolean leapYear = false;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a year:");
        year = scan.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leapYear = true;
                }
            } else
                leapYear = true;
        }
        if (leapYear) {
            System.out.println(year + " is a leap year.");
        } else
            System.out.println(year + " is not a leap year.");
    }
}