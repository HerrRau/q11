/**
 * Diese Klasse dient zur Darstellung eines Graphen mit Hilfe einer Adjazenzmatrix.
 * Sie verwendet dazu eine Klasse Knoten für die Knoten des Graphen, die Kanten
 * werden lediglich in einem zweidimensionalen Array als ganze Zahlen festgehalten.
 * Dabei bedeutet ein Eintrag von -1, dass es zwischen den beteiligten Knoten keine
 * Kante gibt, eine Eintrag von 0 bedeutet, dass es sich jeweils um den Knoten selber
 * handelt und ein Eintrag >0 gibt die Gewichtung einer vorhandenen Kante an.
 * 
 * @author Herr Rau
 * @version Maerz 2012
 */

public class Graph_Matrix {

    // Attribute    
    /**
     * eine Merk-Variable, die angibt, wieviele Knoten bereits im Graphen enthalten sind
     */
    int anzahlKnoten;
    /**
     * ein Feld zur Verwaltung der Knoten (Laenge noch nicht festgelegt)
     */
    Knoten[] knoten;
    /**
     * ein zweidimensionales Feld zur Verwaltung der Kanten (Länge noch nicht festgelegt)
     */
    int [ ][ ] matrix;

    // Konstruktoren
    /**
     * Im Konstruktor gibt man die maximale Anzahl der Knoten an. Es ist nicht möglich, bei 
     * einem angelegten Graphen nachträglich mehr Knoten einzufügen, als beim Anfang angegeben
     * wurden.
     * Im Konstruktor werden alle verwendeten Arrays auf die entsprechende Länge initialisiert.
     * 
     * @param  i die maximale Anzahl der Knoten.
     * 
     */
    public Graph_Matrix(int i) {
        anzahlKnoten = 0;
        knoten = new Knoten[i];
        matrix = new int [i] [i];
        //auch denkbar: jetzt schon alle matrix-Zellen mit dem Wert -1 fuellen


    }

    // Methoden
    /**
     * Innerhalb dieser Methode wird ein neuer Knoten erzeugt und dem Graphen hinzugefügt.
     * Vorher wird überprüft, ob 1. noch Platz für den Knoten ist oder bereits die Maximalzahl
     * erreicht ist, und 2. ob es bereits einen Knoten mit dem gleichen Namen gibt.
     * Dann wird der Knoten in das Knoten-Arrays an der passenden Stelle eingebaut und in der Matrix
     * wird an der passenden Stelle 0 geschrieben.
     * Danach werden alle potentiell möglichen Kanten, die zu dem Knoten gehören könnten, auf -1 
     * gesetzt.
     * Zum Schluss wird der Zähler für die aktuelle Anzahl der Knoten um 1 erhöht.
     * 
     * @param s Bezeichner des einzufügenden Knoten. 
     */
    void knotenEinfuegen(String s) {
        //ist noch Platz fuer einen Knoten da?
        if (anzahlKnoten<knoten.length)
        {
            //ist der Knoten eventuell schon vorhanden?
            if (knotenNummer(s)<0)
            {
                // erzeuge einen neuen Knoten und fuege ihnin das die Knoten 
                // verwaltende Feld (hinten) ein
                knoten[anzahlKnoten] = new Knoten(s);
                // fuelle die Adjazenzmatrix an der Stelle Knoten:Knoten mit 0
                matrix [anzahlKnoten] [anzahlKnoten] = 0;
                // fuelle alle sinnvollen Stellen links von und ueber 
                // dem Knoten:Knoten-Punkt in der matrix mit -1, weil da (noch) keine Kante ist
                for (int i=0; i<anzahlKnoten; i++) {
                    //Symmetrie, da ungerichteter Graph
                    matrix [anzahlKnoten] [i] = -1;
                    matrix [i] [anzahlKnoten] = -1;
                }
                // erhoehe den Knotenzaehler um eins
                anzahlKnoten = anzahlKnoten + 1;
            }
        }
    }

    /**
     * Innerhalb dieser Methode wird eine neue Kante zwischen zwei Knoten erzeugt und dem 
     * Graphen hinzugefuegt.
     * Dazu wird erst ermittelt, ob es die betreffenden Knoten überhaupt gibt. (Dabei werden 
     * aus den Bezeichnern/Schlüsseln der Knoten deren interne Nummern ermittelt, nämlich die 
     * Index-Nummer des Knoten-Arrays. Wenn diese Nummern -1 sind, bedeutet es, dass es Knoten
     * mit diesen Bezeichnern gar nicht gibt.)
     * Nur wenn es beide Knoten gibt, und wenn sie voneinander verschieden sind, dann wird die
     * Kante mit der entsprechenden Gewichtung angelegt.
     * 
     * @param von der Bezeichner des Startknoten der Kante
     * @param nach der Bezeichner des Zielknoten der Kante
     * @param gewichtung die Gewichtung der Kante
     */
    void kanteEinfuegen(String von, String nach, int gewichtung) {
        //wandle die Eingabestrings in die entsrepchende Zahl im Knotenindex um
        int vonNr, nachNr;
        vonNr = knotenNummer(von);
        nachNr = knotenNummer(nach);

        // wenn beide Knoten existieren (eine Nummer != -1 haben) und verschieden von einander sind:
        // fuelle die entsprechende(n) Stelle(n) in der Matrix mit der Gewichtung
        if (vonNr!=-1 && nachNr!=-1 & vonNr != nachNr)
        {
            matrix [vonNr] [nachNr] = gewichtung;
            matrix [nachNr] [vonNr] = gewichtung;
        }        
    }

    /**
     * Diese Methode ermittelt aus dem gegebenen Bezeichner/Schlüssel eines Knotens die entsprechende Nummer
     * in dem Knoten-Array, das zur Verwaltung der Knoten verwendet wird. Das ist eine reine Hilfsmethode.
     * 
     * @param s der Bezeichner des Knoten
     * @return die Nummer des Knoten im Array. Ist -1, wenn es einen Knoten mit diesem Bezeichner nicht gibt.
     */
    int knotenNummer(String s) {
        for (int i=0; i<anzahlKnoten; i++) {
            if (knoten[i].bezeichnungGeben().equals(s)) return i; 
        }
        return -1;
    }

    /**
     * Diese Methode gibt die Adjazenzmatrix des Graphen auf der Konsole aus.
     */
    void ausgeben() {
        int breite = 3;
        //Kopfzeile Leerraum
        for (int i=0;i<breite+1;i++) { System.out.print(" "); }
        //Kopfzeile Rest
        for (int i=0; i<anzahlKnoten;i++) {
            System.out.print(knoten[i].bezFormatGeben(breite));
            System.out.print(' ');
        }
        System.out.println();
        //restliche Zeilen
        for (int i=0; i<anzahlKnoten; i++) {
            //Erste Spalte
            System.out.print(knoten[i].bezFormatGeben(breite));
            System.out.print(' ');
            //Restliche Spalten
            for (int j=0; j<anzahlKnoten; j++)
                if (matrix[i][j] != -1)
                    System.out.print((matrix[i][j]+"    ").substring(0,breite+1));
                else
                    for (int k=0;k<breite+1;k++) { System.out.print(" "); }
            System.out.println();           
        }
    }

    /**
     * Diese Methode ermittelt die Anzahl der Knoten im Graphen. Sie kann nie höher werden als die beim 
     * Anlegen des Graphen festgelegte Höchstgrenze.
     * @return aktuelle Anzahl der Knoten im Graphen.
     */
    int knotenAnzahlGeben() { return anzahlKnoten; }

    void zentralitaetAusgeben() {
        for (int i=0; i<anzahlKnoten; i=i+1) {
            System.out.println(knoten[i].bezeichnungGeben()+": "+zentralitaetBerechnen(i));
        }
    }
    
    int zentralitaetBerechnen(int knotennummer) {
        int ergebnis = 0;
        for (int i=0; i<anzahlKnoten; i=i+1) {
            if (matrix[knotennummer][i]>0) {
                ergebnis = ergebnis +1;
            }
        }
        return ergebnis;
    }
    


}
