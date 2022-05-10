package control;

import model.*;

import java.awt.*;

public class MainController {

    // Attribute

    // Referenzen

    /**
     * Die Main-Methode von Java startet das Programm. Sie ist einzigartig im ganzen Projekt.
     * Sie erzeugt mit dem nachfolgenden Code genau ein Objekt der Klasse MainController und ist
     * dann abgeschlossen.
     */
    public static void main (String[] args){
        EventQueue.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        new MainController();
                    }
                });
    }

    /**
     * Der Konstruktor der Klasse-MainController ist die erste Methode, die nach der Main-Methode
     * aufgerufen wird. Hier wird der Programmfluss geregelt.
     */
    public MainController(){
        //Alle Fächer, die es in unserem Szenario gibt. Man darf gerne erweitern.
        Unterrichtsfach mathematik  = new Unterrichtsfach("Mathematik");
        Unterrichtsfach informatik  = new Unterrichtsfach("Informatik");
        Unterrichtsfach deutsch     = new Unterrichtsfach("Deutsch");

        //Alle Kurse, die es in unserem Szenario gibt. Man darf gerne erweitern.
        Kurs[] einPaarKurse = new Kurs[5];
        for(int i = 0; i < einPaarKurse.length; i++){
            if(i <= 1){
                einPaarKurse[i] = new Kurs(mathematik, "M  G"+(i+1));
            }
            if(2 <= i && i <= 3){
                einPaarKurse[i] = new Kurs(informatik, "If G"+(i-1));
            }
            if(i == 4){
                einPaarKurse[i] = new Kurs(deutsch, "D  G"+(i-3));
            }
        }



        //Alle Schüler, die es in unserem Szenario gibt. Man darf gerne erweitern.
        Schueler[] einPaarSchueler = new Schueler[5];
        einPaarSchueler[0] = new Schueler("Alfred", 15);
        einPaarSchueler[1] = new Schueler("Beatrix", 16);
        einPaarSchueler[2] = new Schueler("Claus", 14);
        einPaarSchueler[3] = new Schueler("Dörte", 15);
        einPaarSchueler[4] = new Schueler("Eberhardt", 16);
        for(int j = 0; j < 3; j++){ //Dreimal wird versucht, den SuS einen zufälligen Kurs zuzuweisen.
            for(int i = 0; i < einPaarSchueler.length; i++){
                int kursnummer = (int)(Math.random()*einPaarKurse.length);  //Ein zufälliger Kurs wird einem Schüler zugewiesen.
                einPaarSchueler[i].addKurs(einPaarKurse[kursnummer]);
            }
        }



        //Alle Lehrer, die es in unserem Szenario gibt. Darf gerne erweitert werden.
        Lehrer[] einPaarLehrer = new Lehrer[2];
        einPaarLehrer[0] = new Lehrer("Herr Ambrolord", 32, "A1");
        einPaarLehrer[1] = new Lehrer("Herr Knebel", 28, "A100");

        for(int i = 0; i < einPaarLehrer.length; i++){
            einPaarLehrer[i].addFach(mathematik);
            einPaarLehrer[i].addFach(informatik);
        }

        einPaarLehrer[0].addKurs(einPaarKurse[0]);
        einPaarLehrer[0].addKurs(einPaarKurse[2]);
        einPaarLehrer[1].addKurs(einPaarKurse[1]);
        einPaarLehrer[1].addKurs(einPaarKurse[3]);

        Schulleiter hpBaxter = new Schulleiter("Herr H.P. Baxter", 49, "A3000");
        hpBaxter.addFach(mathematik);
        hpBaxter.addFach(deutsch);
        hpBaxter.addKurs(einPaarKurse[4]);

        hpBaxter.tadelEinenSchueler(einPaarSchueler[1], new Tadel("Frau Storch wurde beim Dönerkauf beobachtet."));
        hpBaxter.tadelEinenSchueler(einPaarSchueler[4], new Tadel("Tadel wegen schönen Augen."));

        System.out.println("-----------------------------");
        System.out.println(einPaarKurse[0].getInfo());
    }

}
