package Präsentation;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@RequestScoped
public class KundeAnlegenController {

    FirmenkundeAnlegenModel firmenkundeAnlegenModel = new FirmenkundeAnlegenModel();

    public FirmenkundeAnlegenModel getFirmenkundeAnlegenModel() {
        return firmenkundeAnlegenModel;
    }

    public void setFirmenkundeAnlegenModel(FirmenkundeAnlegenModel firmenkundeAnlegenModel) {
        this.firmenkundeAnlegenModel = firmenkundeAnlegenModel;
    }

    @Inject
    private KundenverwaltungWrapper kundenverwaltungWrapper;

    public String speichereKunden() {
        kundenverwaltungWrapper.speichereKunden(firmenkundeAnlegenModel);
        return "/firmenkundeAnsehen.jsf";
    }
}
