public class Tapahtuma {
    private TapahtumanTyyppi tyyppi;
    private long vali;

    public Tapahtuma(TapahtumanTyyppi tyyppi, long vali){
        this.tyyppi = tyyppi;
        this.vali = vali;
    }

    public TapahtumanTyyppi getTyyppi(){
        return tyyppi;
    }

    public long getVali() {
        return vali;
    }
}
