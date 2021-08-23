import Kundenverwaltung.Firmenkunde;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class KundenTest {

    private EntityManager em;

    @Before
    public void setup() throws Exception{
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("kundenjpa");
        em = emf.createEntityManager();
    }

    @Test
    public void speichereKunde () {
        em.getTransaction().begin();
        Firmenkunde fkunde = new Firmenkunde();
        fkunde.setIdNr("1234566");
        fkunde.setNachname("Mustermann");
        fkunde.setVorname("Max");
        //Speichern des Objektes
        em.persist(fkunde);

        em.persist(fkunde);
        em.getTransaction().commit();

    }

}
