package Präsentation;

import KundenverwaltungCore.FirmenkundeAnlegen;
import KundenverwaltungCore.FirmenkundeAnsehen;
import KundenverwaltungCore.Kundenverwaltung;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import java.util.LinkedList;
import java.util.List;

@Dependent
public class KundenverwaltungWrapperImpl implements KundenverwaltungWrapper{

    @Inject
    private Kundenverwaltung kundenverwaltung;

    private Mapper mapper = new DozerBeanMapper();

    @Override
    public void speichereKunden (FirmenkundeAnlegenModel firmenkundeAnlegenModel) {

        FirmenkundeAnlegen firmenkundeAnlegen = mapper.map(firmenkundeAnlegenModel, FirmenkundeAnlegen.class);
        kundenverwaltung.legeKundenAn(firmenkundeAnlegen);

    }

    @Override
    public List<FirmenkundeAnsehenModel> firmenkundenAnsehen() {
       List<FirmenkundeAnsehen> firmenkundeAnsehen = kundenverwaltung.firmenkundenAnsehen();
       List<FirmenkundeAnsehenModel> firmenkundeAnsehenModel = new LinkedList<>();

       for (FirmenkundeAnsehen k: firmenkundeAnsehen) {
           firmenkundeAnsehenModel.add(mapper.map(k,FirmenkundeAnsehenModel.class));


       }
        return firmenkundeAnsehenModel;
    }
}
