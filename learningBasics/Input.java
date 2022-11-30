import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name :");
        System.out.println("Enter your age :");

        String name = input.next();
        int age = input.nextInt();
        System.out.println("your name is " + name);
        System.out.println("your are " + age);
    }
}
