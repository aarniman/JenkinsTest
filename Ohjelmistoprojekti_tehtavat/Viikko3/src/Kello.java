import java.text.SimpleDateFormat;
import java.util.Date;

public class Kello {
    private Date aika;
    private static Kello INSTANCE;

    private Kello(){
        this.aika = new Date();
    }

    public static synchronized Kello getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Kello();
        }
        return INSTANCE;
    }

    public void setAika(Date aika) {
        this.aika = aika;
    }

    public Date getAika() {
        return aika;
    }

    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(this.aika);
    }
}
