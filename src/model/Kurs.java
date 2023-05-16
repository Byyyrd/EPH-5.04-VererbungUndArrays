package model;

import control.MainController;

import javax.xml.namespace.QName;
import java.util.Arrays;

/**
 * Created by Jean-Pierre on 10.05.2017.
 */
public class Kurs {

    //Attribute
    private String kursBezeichnung;

    //Referenzen
    private Unterrichtsfach fach;
    private Lehrer lehrkraft;
    private Schueler[] schuelerDesKurses;

    /**
     * In einem Kurs wird ein Unterrichtsfach unterricht. Diesem Kurs kann später ein Lehrer hinzugefügt werden.
     * Schüler werden einzeln hinzugefügt.
     * @param kursName
     */
    public Kurs(Unterrichtsfach fach, String kursName){
        this.fach = fach;
        this.kursBezeichnung = kursName;
    }

    public String getKursBezeichnung() {
        return kursBezeichnung;
    }

    public Unterrichtsfach getFach() {
        return fach;
    }

    public Lehrer getLehrkraft() {
        return lehrkraft;
    }

    public void setLehrkraft(Lehrer lehrkraft) {
        this.lehrkraft = lehrkraft;
    }

    /**
     * Ein Schüler wird der Menge der Schüler hinzugefügt.
     * Da wir auf der Datenstruktur Array arbeiten und diese eine statische Größe hat, müssen wir tricksen.
     * Überlegt euch etwas kluges!
     * @param neuerSchueler
     */
    public void addSchueler(Schueler neuerSchueler){
        //TODO Hinzufügen eines Schülers zu einem Kurs.
        schuelerDesKurses = MainController.arrayAdd(schuelerDesKurses,neuerSchueler,Schueler.class);
    }

    /**
     * Methode erstellt aus den Informationen zum Kurs (Kursbezeichnung, Fach, Lehrer, Schülernamen) eine kompakte Information
     * und gibt diese als String zurück.
     * @return
     */
    public String getInfo(){
        StringBuilder info = new StringBuilder();
        info.append("Name: ").append(kursBezeichnung);
        if (fach != null) {
            info.append("  Fach: ").append(fach.getFachBezeichnung());
        }
        if (lehrkraft != null){
            info.append("  Lehrer: ").append(lehrkraft.getName());
        }
        info.append("  Schueler: ");
        for (int i = 0; i < schuelerDesKurses.length; i++) {
            if (i != 0) {
                info.append(",").append(schuelerDesKurses[i].getName());
            }else {
                info.append(schuelerDesKurses[i].getName());
            }
        }
        //TODO Kompakte Zeichenkette zu den Informationen eines Kurses - gut lesbar!
        return info.toString();
    }
}
