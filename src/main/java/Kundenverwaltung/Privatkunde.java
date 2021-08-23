package Kundenverwaltung;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Privatkunde")
public class Privatkunde extends Kunde{

    public Privatkunde() {

    }

    public Privatkunde(String vorname, String nachname) {
        super(vorname, nachname);
    }


}
