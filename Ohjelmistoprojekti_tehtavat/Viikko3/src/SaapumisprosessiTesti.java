import java.util.Random;

public class SaapumisprosessiTesti {
    public static void main(String[] args) {
        Random r = new Random();
        Saapumisprosessi sp = new Saapumisprosessi(TapahtumanTyyppi.SAAPUMINEN1, r);

        for (int i = 0; i < 10; i++) {
            sp.uusiTapahtuma();
        }

        for (Tapahtuma t: sp.getTapahtumalista()){
            System.out.println("Tyyppi: " + t.getTyyppi() + ", Saapumisvali: " + t.getVali());
        }
    }
}
