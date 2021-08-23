package Kundenverwaltung;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@DiscriminatorValue("Firmenkunde")
@Table
@NamedQueries({
        @NamedQuery(name = "sucheAlleFirmenkunden", query = "SELECT fk FROM Firmenkunde fk")
})
public class Firmenkunde extends Kunde implements Serializable {

    private static final long serialVersionUID =  6169566012052787640L;

    @Column
    private String idNr;


    public Firmenkunde() {
    }

    public Firmenkunde(String vorname, String nachname) {
        super(vorname, nachname);
    }

    public String getIdNr() {
        return idNr;
    }

    public void setIdNr(String idNr) {
        this.idNr = idNr;
    }
}
