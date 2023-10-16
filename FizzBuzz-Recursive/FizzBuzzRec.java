import java.util.Scanner;

public class FizzBuzzRec {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        try {
            System.out.println("Please enter a positive number: ");
            int num = console.nextInt();

            isFizzBuzz(num);
        } finally {
            console.close();
        }
    }

    public static void isFizzBuzz(int n)
    {
        if (n == 0) return;

        isFizzBuzz(n-1);

        if (n % 3 == 0 && n % 5 == 0) System.out.println("FizzBuzz!");
        else if (n % 5 == 0) System.out.println("Buzz");
        else if (n % 3 == 0) System.out.println("Fizz");
        else System.out.println(n);
    }
}
