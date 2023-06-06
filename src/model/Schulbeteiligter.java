package model;

import control.MainController;

public abstract class Schulbeteiligter {
    protected String name;
    protected int alter;
    protected Kurs[] kurse;

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

    public Schulbeteiligter(String name, int alter){
        this.name = name;
        this.alter = alter;
    }
    /**
     * Ein Kurs wird der Menge der Kurse hinzugefügt.
     * Da wir auf der Datenstruktur Array arbeiten und diese eine statische Größe hat, müssen wir tricksen.
     * Überlegt euch etwas kluges!
     * Sobald das Array erweitert wurde, muss dem Kurs noch mitgeteilt werden, dass dieser Lehrer den Kurs übernimmt.
     * @param neuerKurs
     */
    public void addKurs(Kurs neuerKurs){
        //TODO Hinzufügen eines Kurses, den ein Lehrer unterrichten muss.
        kurse = MainController.arrayAdd(kurse,neuerKurs, Kurs.class);
    }

    public String getInfo(){
        //TODO Kompakte Zeichenkette zu den Informationen eines Beteiligten - gut lesbar!
        return "Name: " + name + "  Alter: " + alter + "  ";
    }
}
