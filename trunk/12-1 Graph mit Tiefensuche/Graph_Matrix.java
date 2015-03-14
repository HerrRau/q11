/**
 * Diese Klasse dient zur Darstellung eines Graphen mit Hilfe einer Adjazenzmatrix.
 * Sie verwendet dazu eine Klasse Knoten fuer die Knoten des Graphen, die Kanten
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
     * ein zweidimensionales Feld zur Verwaltung der Kanten (Laenge noch nicht festgelegt)
     */
    int [ ][ ] matrix;
    /**
     * ein Feld zur Markierung der Knoten als besucht oder nicht (Laenge noch nicht festgelegt)
     */
    boolean [] besucht;

    // Konstruktoren
    /**
     * Im Konstruktor gibt man die maximale Anzahl der Knoten an. Es ist nicht moeglich, bei 
     * einem angelegten Graphen nachtraeglich mehr Knoten einzufuegen, als beim Anfang angegeben
     * wurden.
     * Im Konstruktor werden alle verwendeten Arrays auf die entsprechende Laenge initialisiert.
     * 
     * @param  i die maximale Anzahl der Knoten.
     * 
     */
    public Graph_Matrix(int i) {
        anzahlKnoten = 0;
        knoten = new Knoten[i];
        matrix = new int [i] [i];
        besucht = new boolean [i];
        //auch denkbar: jetzt schon alle matrix-Zellen mit dem Wert -1 fuellen
    }

    // Methoden
    /**
     * Innerhalb dieser Methode wird ein neuer Knoten erzeugt und dem Graphen hinzugefuegt.
     * Vorher wird ueberprueft, ob 1. noch Platz fuer den Knoten ist oder bereits die Maximalzahl
     * erreicht ist, und 2. ob es bereits einen Knoten mit dem gleichen Namen gibt.
     * Dann wird der Knoten in das Knoten-Arrays an der passenden Stelle eingebaut und in der Matrix
     * wird an der passenden Stelle 0 geschrieben.
     * Danach werden alle potentiell moeglichen Kanten, die zu dem Knoten gehoeren koennten, auf -1 
     * gesetzt.
     * Zum Schluss wird der Zaehler fuer die aktuelle Anzahl der Knoten um 1 erhoeht.
     * 
     * @param s Bezeichner des einzufuegenden Knoten. 
     */
    void knotenEinfuegen(String s) {
        if (anzahlKnoten<knoten.length)
        {
            if (knotenNummer(s)<0)
            {
                knoten[anzahlKnoten] = new Knoten(s);
                matrix [anzahlKnoten] [anzahlKnoten] = 0;
                for (int i=0; i<anzahlKnoten; i++) {
                    //Symmetrie, da ungerichteter Graph
                    matrix [anzahlKnoten] [i] = -1;
                    matrix [i] [anzahlKnoten] = -1;
                }
                anzahlKnoten = anzahlKnoten + 1;
            }
        }
    }

    /**
     * Innerhalb dieser Methode wird eine neue Kante zwischen zwei Knoten erzeugt und dem 
     * Graphen hinzugefuegt.
     * Dazu wird erst ermittelt, ob es die betreffenden Knoten ueberhaupt gibt. (Dabei werden 
     * aus den Bezeichnern/Schluesseln der Knoten deren interne Nummern ermittelt, naemlich die 
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
        int vonNr, nachNr;
        vonNr = knotenNummer(von);
        nachNr = knotenNummer(nach);
        if (vonNr!=-1 && nachNr!=-1 & vonNr != nachNr)
        {
            matrix [vonNr] [nachNr] = gewichtung;
            matrix [nachNr] [vonNr] = gewichtung;
        }        
    }

    /**
     * Diese Methode ermittelt aus dem gegebenen Bezeichner/Schluessel eines Knotens die entsprechende Nummer
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
        int breite = 4;
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
     * Diese Methode ermittelt die Anzahl der Knoten im Graphen. Sie kann nie hoeher werden als die beim 
     * Anlegen des Graphen festgelegte Hoechstgrenze.
     * @return aktuelle Anzahl der Knoten im Graphen.
     */
    int knotenAnzahlGeben() { return anzahlKnoten; }

    /**
     * Startet die Tiefensuche automatisch vom ersten Element des Feldes aus.
     */
    void tiefensuche() {
        for (int i = 0;i < anzahlKnoten; i++) {
            besucht[i] = false;
        }
        if (anzahlKnoten>0) {
            besuchen(0);
        }
    }

    /**
     * Startet die Tiefensuche von einem beliebigen Startpunkt aus.
     * Bereitet davor alles fuer die Tiefensuche vor - setzt insbesondere
     * alle Knoten auf unbesucht und ruft danach die eigentliche rekursive
     * Suchmethode auf.
     * @param s *Bezeichner* des Startknotens
     */
    void tiefensuche(String s) {
        int startNummer = knotenNummer(s);
        if (startNummer!=-1) {
            for (int i = 0;i < anzahlKnoten; i++) {
                besucht[i] = false;
            }
            besuchen(startNummer);
        }
    }

    /**
     * Die eigentliche rekursive Tiefensuchmethode. Markiert den aktuellen Knoten als besucht
     * und ueberprueft danach alle vorhandenen Kanten von diesem Knoten aus, ob sie noch verfolgt
     * werden muessen. Wenn ja, wird fuer die jeweiligen Knoten wieder diese Methode aufgerufen.
     * @param i *Nummer* des aktuell behandelten Knotens
     */
    void besuchen(int i) {
        //aktuellen Knoten als besucht markieren
        besucht[i] = true;
        System.out.println(knoten[i].bezeichnungGeben() + " ist besucht.");

        //in den Zeilen nach Kanten zu unbesuchten Nachbarn suchen
        for (int z=0;z<anzahlKnoten;z++) {
            if (matrix[i] [z] > 0 && besucht [z] == false) {
                besuchen(z);
                System.out.println("zurueck nach " + knoten[i].bezeichnungGeben());                
            }
        }

        //fertig
        System.out.println(knoten[i].bezeichnungGeben() + " ist erledigt.");

    }

}
