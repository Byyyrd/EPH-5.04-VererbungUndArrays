package model;

import control.MainController;

/**
 * Created by Jean-Pierre on 10.05.2017.
 */
public class Lehrer extends Schulbeteiligter{

    //Attribute
    protected String besoldungsGruppe;

    //Referenzen
    protected Unterrichtsfach[] faecherDesLehrers;

    /**
     * Ein Objekt der Klasse Lehrer wird erstellt.
     * @param name
     * @param alter
     * @param besoldungsGruppe    Gehaltsstufen von Lehrern
     */
    public Lehrer(String name, int alter, String besoldungsGruppe) {
        super(name,alter);
        this.besoldungsGruppe = besoldungsGruppe;
    }



    public String getBesoldungsGruppe() {
        return besoldungsGruppe;
    }

    public void setBesoldungsGruppe(String besoldungsGruppe) {
        this.besoldungsGruppe = besoldungsGruppe;
    }


    /**
     * Ein Fach wird der Menge der unterrichtenden Fächer hinzugefügt.
     * Da wir auf der Datenstruktur Array arbeiten und diese eine statische Größe hat, müssen wir tricksen.
     * Überlegt euch etwas kluges!
     * @param neuesFach
     */
    public void addFach(Unterrichtsfach neuesFach){
        //TODO Hinzufügen eines Faches, das ein Lehrer unterrichten kann.
        faecherDesLehrers = MainController.arrayAdd(faecherDesLehrers,neuesFach, Unterrichtsfach.class);
    }

    /**
     * Methode erstellt aus den Informationen zum Lehrer (Name, Alter, Besoldungsgruppe, Kurse, Fächer) eine kompakte Information
     * und gibt diese als String zurück.
     * @return
     */
    @Override
    public String getInfo(){
        return super.getInfo() + "BesoldungsGruppe: " + besoldungsGruppe;
    }
}
