
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String args[]) {
        Scanner backy = new Scanner(System.in);
        double fnum, snum, answer;
        System.out.println("Enter first number:  ");
        fnum = backy.nextDouble();
        System.out.println("Enter second number:   ");
        snum = backy.nextDouble();
        answer = fnum + snum;
        System.out.println("Your answer is - " + answer);

    }
}