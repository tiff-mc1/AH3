import java.util.Scanner;

public class Fizzbuzz {
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
        int i = 1;
        while (i <= n) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz!");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }

            i++;
        }
    }
}