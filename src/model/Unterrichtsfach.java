package model;

/**
 * Created by Jean-Pierre on 10.05.2017.
 */
public class Unterrichtsfach {

    //Attribute
    private String fachBezeichnung;

    /**
     * Ein Objekt der Klasse Unterrichtsfach stellt ein Unterrichtsfach dar, unabhängig von Schülern und Lehrern.
     * Damit hebt es sich ab von einem Kurs.
     * Diese Klasse ist offiziell fertigstellt und enthält deswegen keine TODOs.
     * @param fachbezeichnung
     */
    public Unterrichtsfach(String fachbezeichnung){
        this.fachBezeichnung = fachbezeichnung;
    }

    /**
     * Gibt die Fachbezeichnung zurück. Diese kann niemals geändert werden.
     * @return
     */
    public String getFachBezeichnung(){
        return fachBezeichnung;
    }
}
