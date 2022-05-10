package model;

/**
 * Created by Jean-Pierre on 10.05.2017.
 */
public class Tadel {

    //Attribute
    private String tadelBeschreibung;

    //Referenzen

    /**
     * Ein Objekt der Klasse Tadel besteht einzig aus der Beschreibung des Vergehens.
     * Diese Klasse ist offiziell fertigstellt und enthält deswegen keine TODOs.
     * @param beschreibung
     */
    public Tadel(String beschreibung){
        this.tadelBeschreibung = beschreibung;
    }

    /**
     * Gibt die Beschreibung des Vergehens zurück. Diese kann niemals geändert werden.
     * @return
     */
    public String getTadelBeschreibung(){
        return tadelBeschreibung;
    }
}
