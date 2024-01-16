import java.text.DecimalFormat;
import java.util.Scanner;

public class Task3 {
    public void convert(){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Weight (g): ");
        int grams = Integer.parseInt(scanner.nextLine());
        double luoti = grams / 13.28;
        int naula = (int) luoti / 32;
        int leiviska = naula / 20;
        luoti = luoti % 32;
        naula = naula % 20;
        System.out.println(grams + " grams is " + leiviska + " leiviskä, " + naula + " naula, and " + df.format(luoti) + " luoti.");
    }
}
