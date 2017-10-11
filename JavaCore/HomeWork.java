import java.util.Scanner;
import static java.lang.Math.*;

public class HomeWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
/* Task 1 */
        System.out.println("Enter radius");
        double radius = input.nextDouble();
        System.out.printf("Area ≈ %.5g%n", PI * 2 * radius);
        System.out.printf("Circumference ≈ %.5g%n", PI * pow(radius, 2));   
/* Task 2 */
        System.out.println("What is your name");
        input.nextLine();
        String name = input.nextLine();
        System.out.println("How old are you?");
        int age = input.nextInt();
        System.out.printf("Name: %s%nAge: %d%n", name, age);
/* Task 3 */
        int year = 2016;
        boolean isLeapYear = false;
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            isLeapYear = true;
        }
        System.out.println(isLeapYear);
/* Task 4 */
        int i, space, rows = 15, tmp = 0;
        for (i = 1; i <= rows; ++i, tmp = 0) {
            for (space = 1; space <= rows - i; ++space) 
                System.out.print("  ");
            while (tmp != 2 * i - 1) {
                System.out.print("* ");
                ++tmp;
            }
            System.out.println();
        }
    }
}
