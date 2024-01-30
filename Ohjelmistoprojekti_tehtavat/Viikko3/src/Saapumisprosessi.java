import java.util.ArrayList;
import java.util.Random;
import eduni.distributions.*;

public class Saapumisprosessi {
    private RandomGenerator rg;
    private ArrayList<Tapahtuma> lista;
    private Random r;
    private TapahtumanTyyppi tt;

    public Saapumisprosessi(TapahtumanTyyppi tt, Random r){
        this.lista = new ArrayList<Tapahtuma>();
        this.r = r;
        this.tt = tt;
        this.rg = new RandomGenerator(r.nextLong());
    }

    public void uusiTapahtuma(){
        long vali = luoVali();
        Tapahtuma uusiTapahtuma = new Tapahtuma(tt, vali);
        lista.add(uusiTapahtuma);
    }

    private long luoVali(){
        return (long) rg.nextLong();
    }

    public ArrayList<Tapahtuma> getTapahtumalista(){
        return lista;
    }
}
