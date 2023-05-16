package model;

import control.MainController;

/**
 * Created by Jean-Pierre on 10.05.2017.
 */
public class Schueler extends Schulbeteiligter{
    //Referenzen
    private Tadel[] tadelDesSchuelers;

    /**
     * Ein Objekt der Klasse Schüler.
     * @param name
     * @param alter
     */
    public Schueler(String name, int alter) {
        super(name, alter);
    }

    /**
     * Ein Tadel wird der Menge der Tadel hinzugefügt.
     * Da wir auf der Datenstruktur Array arbeiten und diese eine statische Größe hat, müssen wir tricksen.
     * Überlegt euch etwas kluges!
     * @param neuerTadel
     */
    public void addTadel(Tadel neuerTadel){
        //TODO Hinzufügen eins Tadels für den Schüler.
        tadelDesSchuelers = MainController.arrayAdd(tadelDesSchuelers,neuerTadel,Tadel.class);
    }
    @Override
    public String getInfo(){
        return super.getInfo() + "AnzahlTadel: " + tadelDesSchuelers.length;
    }

}
