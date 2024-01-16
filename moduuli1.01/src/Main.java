import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Hello and welcome user!");
        System.out.println();

        //Task 2
        System.out.println("    *");
        System.out.println("   ***");
        System.out.println("  *****");
        System.out.println(" *******");
        System.out.println();

        //Task 3
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (first + second + third));
        System.out.println("The product of the numbers is " + (first * second * third));
        float avg = (float) (first + second + third) / 3;
        System.out.println("The average of the numbers is " + avg);
        System.out.println();

        //Task 4
        Cat whis = new Cat("Whiskers");
        Cat rex = new Cat("Rex");

        whis.meow();
        whis.meow();
        rex.meow();
        whis.meow();
        }
    }
