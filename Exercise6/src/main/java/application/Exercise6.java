package application;
import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] arge){
        Scanner A = new Scanner(System.in);
        Scanner B = new Scanner(System.in);
        double a;
        double b;
        System.out.println("What do you want the first number to be?");
        a = A.nextInt();
        System.out.println("What do you want the second number to be?");
        b = B.nextInt();
        double c = a + b;
        double d = a * b;
        double e = a /  b;
        double f = a - b;
        System.out.println(a + " + " + b + " = " + c);
        System.out.println(a + " * " + b + " = " + d);
        System.out.println(a + " / " + b + " = " + e);
        System.out.println(a + " - " + b + " = " + f);
    }
}