import java.text.DecimalFormat;
import java.util.Scanner;
public class Task1 {
    public void convert(){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0");

        System.out.println("Give temperature in fahrenheit.");
        double fah = Double.parseDouble(scanner.nextLine());

        double cel = (fah - 32) / 1.8;
        System.out.println(df.format(cel));

    }
}
