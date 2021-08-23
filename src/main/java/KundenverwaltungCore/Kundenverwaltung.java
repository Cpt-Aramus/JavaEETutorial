package KundenverwaltungCore;

import java.util.List;

public interface Kundenverwaltung {

    void legeKundenAn (FirmenkundeAnlegen firmenkundeAnlegen);

    List<FirmenkundeAnsehen> firmenkundenAnsehen();
}
