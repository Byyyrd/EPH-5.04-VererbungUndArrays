package model;

/**
 * Created by Jean-Pierre on 10.05.2017.
 */
public class Schulleiter extends Lehrer {

    public Schulleiter(String name, int alter, String besoldungsGruppe) {
        super(name,alter,besoldungsGruppe);
    }
    /**
     * Einem Schüler wird ein Tadel hinzugefügt.
     * @param s Der zu tadelnde Schüler.
     * @param t Der Tadel.
     */
    public void tadelEinenSchueler(Schueler s, Tadel t){
        //TODO Umsetzung dafür, dass ein Schulleiter einem Schüler einen Tadel geben kann.
        s.addTadel(t);
    }

}
