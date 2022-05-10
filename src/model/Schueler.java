package model;

/**
 * Created by Jean-Pierre on 10.05.2017.
 */
public class Schueler {

    //Attribute
    private String name;
    private int alter;

    //Referenzen
    private Kurs[] kurseDesSchuelers;
    private Tadel[] tadelDesSchuelers;

    /**
     * Ein Objekt der Klasse Schüler.
     * @param name
     * @param alter
     */
    public Schueler(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    /**
     * Ein Kurs wird der Menge der Kurse hinzugefügt.
     * Da wir auf der Datenstruktur Array arbeiten und diese eine statische Größe hat, müssen wir tricksen.
     * Überlegt euch etwas kluges!
     * @param neuerKurs
     */
    public void addKurs(Kurs neuerKurs){
        //TODO Hinzufügen eines Kurses, den ein Schüler aufsuchen muss.
    }

    /**
     * Ein Tadel wird der Menge der Tadel hinzugefügt.
     * Da wir auf der Datenstruktur Array arbeiten und diese eine statische Größe hat, müssen wir tricksen.
     * Überlegt euch etwas kluges!
     * @param neuerTadel
     */
    private void addTadel(Tadel neuerTadel){
        //TODO Hinzufügen eins Tadels für den Schüler.
    }

    /**
     * Methode erstellt aus den Informationen zum Schüler (Name, Alter, Kurse, Tadel) eine kompakte Information
     * und gibt diese als String zurück.
     * @return
     */
    public String getInfo(){
        String info = "";
        //TODO Kompakte Zeichenkette zu den Informationen eines Schülers - gut lesbar!
        return info;
    }
}
