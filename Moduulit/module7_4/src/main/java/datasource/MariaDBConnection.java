package datasource;

import jakarta.persistence.*;

public class MariaDBConnection {
    private static EntityManagerFactory emf = null;
    private static EntityManager em = null;

    public static EntityManager getInstance(){
        if(em == null){
            if(emf == null){
                emf = Persistence.createEntityManagerFactory("CurrencyConverterMariaDBUnit");
            }
            em = emf.createEntityManager();
        }
        return em;
    }
}
