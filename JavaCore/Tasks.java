import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/* Task 1 */
        int a, b;
        System.out.println("Enter an integer and press enter key");
        a = input.nextInt();
        System.out.println("Enter an integer and press enter key");
        b = input.nextInt();
        System.out.printf("a + b = %d%n", a + b);
        System.out.printf("a - b = %d%n", a - b);
        System.out.printf("a * b = %d%n", a * b);
        System.out.printf("a / b = %d%n", a / b);
/* Task 2 */
        input.nextLine();
        System.out.println("How are you?");
        String answer = input.nextLine();
        System.out.println("You are " + answer);
/* Task 3 */ 
    // if
        int m = 0, n = 0;
        if (m > 0) 
            n = 1;
        else if (m == 0)
            n = 0;
        else if (m < 0) 
            n = -1;
    // ternary
        n = m > 0 ? 1 : m == 0 ? 0 : m < 0 ? -1 : Integer.MIN_VALUE;
/* Task 4 */
        int sum = 0;
        for (int i = 0; i <= 10; i++) 
            sum += i;
        System.out.println(sum);
    }
}