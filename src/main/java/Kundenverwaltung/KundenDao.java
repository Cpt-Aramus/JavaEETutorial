package Kundenverwaltung;

import jakarta.ejb.Stateless;
import jakarta.persistence.TypedQuery;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class KundenDao {

    @PersistenceContext
    private EntityManager em;

    public void legeKundenAn (Kunde kunde) {

        em.persist(kunde);

    }

    public List<Firmenkunde> sucheAlleFirmenKunden () {

        TypedQuery<Firmenkunde> query = (TypedQuery<Firmenkunde>) em.createNamedQuery("sucheAlleFirmenkunden", Firmenkunde.class);

        return query.getResultList();


    }

}
