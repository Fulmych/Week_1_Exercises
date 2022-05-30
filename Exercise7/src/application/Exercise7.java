package application;
import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] arge){
        int totalseconds;
        Scanner chooseseconds = new Scanner(System.in);
        System.out.println("Please choose an amount of seconds:");
        totalseconds = chooseseconds.nextInt();
        int hours = totalseconds / 3600;
        int minutes = (totalseconds % 3600) / 60;
        int seconds = totalseconds % 60;
        String timeString;
        timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        System.out.println("Your chosen amount of seconds was " + totalseconds + " which converts to " + timeString);
    }
}
