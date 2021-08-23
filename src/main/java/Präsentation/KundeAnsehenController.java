package Präsentation;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class KundeAnsehenController {

    @Inject
    private KundenverwaltungWrapper kundenverwaltungWrapper;

    private FirmenkundeAnsehenModel firmenkundeAnsehenModel = new FirmenkundeAnsehenModel();

    private List<FirmenkundeAnsehenModel> kundenansehen = new ArrayList<>();

    public FirmenkundeAnsehenModel getFirmenkundeAnsehenModel() {
        return firmenkundeAnsehenModel;
    }

    public void setFirmenkundeAnsehenModel(FirmenkundeAnsehenModel firmenkundeAnsehenModel) {
        this.firmenkundeAnsehenModel = firmenkundeAnsehenModel;
    }

    public List<FirmenkundeAnsehenModel> getKundenansehen() {
        return kundenansehen;
    }

    public void setKundenansehen(List<FirmenkundeAnsehenModel> kundenansehen) {
        this.kundenansehen = kundenansehen;
    }
    @PostConstruct
    public void init () {
        this.getKundenansehen().addAll(firmenkundenAnsehen());
    }

    public ArrayList<FirmenkundeAnsehenModel> firmenkundenAnsehen() {
        List<FirmenkundeAnsehenModel> firmenkundeAnsehenModel = kundenverwaltungWrapper.firmenkundenAnsehen();
        ArrayList<FirmenkundeAnsehenModel> kunden = new ArrayList<>(firmenkundeAnsehenModel);

        return kunden;
    }
}
