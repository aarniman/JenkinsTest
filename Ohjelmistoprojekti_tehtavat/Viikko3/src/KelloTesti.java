import java.util.Date;

public class KelloTesti {
    public static void main(String[] args) throws InterruptedException {
        Kello kello = Kello.getInstance();

        System.out.println("Alkuperäinen aika: " + kello.toString());

        Date newAika = new Date();
        kello.setAika(newAika);
        System.out.println("Uusi aika: " + kello.toString());

        Kello eriKello = Kello.getInstance();
        System.out.println("Eri kellon aika: " + eriKello.toString());
    }
}
