package KundenverwaltungCore;

import jakarta.inject.Inject;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import Kundenverwaltung.Kunde;
import Kundenverwaltung.KundenDao;
import Kundenverwaltung.Firmenkunde;

import java.util.LinkedList;
import java.util.List;

public class KundenverwaltungImpl implements Kundenverwaltung{

    private Mapper mapper = new DozerBeanMapper();

    @Inject
    private KundenDao kundenDao;

    @Override
    public void legeKundenAn(FirmenkundeAnlegen firmenkundeAnlegen) {

        Firmenkunde kunde = mapper.map(firmenkundeAnlegen, Firmenkunde.class);

        kundenDao.legeKundenAn(kunde);

    }

    @Override
    public List<FirmenkundeAnsehen> firmenkundenAnsehen () {
        List<Firmenkunde> alleFirmenkunden = kundenDao.sucheAlleFirmenKunden();

        List <FirmenkundeAnsehen> firmenkundeAnsehen = new LinkedList();

        for (Firmenkunde k: alleFirmenkunden) {
            firmenkundeAnsehen.add(mapper.map(k, FirmenkundeAnsehen.class));
        }
        return firmenkundeAnsehen;
    }


}
