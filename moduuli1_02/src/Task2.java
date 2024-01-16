import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class Task2 {
    public void triangle(){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Give the first leg of the triangle.");
        int leg1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second leg of the triangle.");
        int leg2 = Integer.parseInt(scanner.nextLine());

        double hyp = (double) Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));
        System.out.println(df.format(hyp));
    }
}
