import java.util.LinkedList;
import java.util.Random;

public class Palvelupiste {
    private LinkedList<Asiakas> jono;
    private Random rand;

    public void lisaaJonoon(Asiakas a){
        this.jono.add(a);
    }

    public Asiakas poistaJonosta(){
        Asiakas a = this.jono.getFirst();
        this.jono.removeFirst();
        return a;
    }

    public void palvele() throws InterruptedException {
        rand = new Random();
        do {
            this.jono.getFirst().setEnd();
            Thread.sleep(rand.nextLong(9999));
            Asiakas a = poistaJonosta();
            long time = a.time() / 1000;
            System.out.println(time + " s");
        }while (!this.jono.isEmpty());
    }
}
