package application;
import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] arge) {
        Scanner Name = new Scanner(System.in);
        String name;
        System.out.println("Please enter you name:");
        name = Name.nextLine();
        System.out.println("Hello " + name + "!");
    }
}