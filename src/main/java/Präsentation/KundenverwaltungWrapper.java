package Präsentation;

import java.util.List;

public interface KundenverwaltungWrapper {

    void speichereKunden(FirmenkundeAnlegenModel firmenkundeAnlegenModel);

    List<FirmenkundeAnsehenModel> firmenkundenAnsehen();
}
