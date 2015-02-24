public class Knoten {
    // Attribute
    /** 
     * Eine Zeichenkette, die den Inhalt des Knotens repraesentiert. Ausserdem der Schluessel des Knotens.
     */
    String bezeichnung;
    
    // Konstruktoren
    /**
     * Im Konstruktor wird dem Bezeichnungsattribut des Knoten ein Wert zugewiesen.
     * @param s der Bezeichner des zu erstellenden Knoten
     */
    public Knoten(String s) {
        bezeichnung = s;
    }

    // Methoden
    /**
     * Gibt den Bezeichner des Knotenobjekts zur�ck, dessen bisher einziges Attribut. 
     * @return  der Bezeichner oder Schluessel des Knoten
     */
    public String bezeichnungGeben() {
        return bezeichnung; 
    }
    
    /**
     *  Eine laestige Methode, die nur zur Darstellung auf der Konsole gebraucht wird.
     *  Sie gibt den Bezeichner des Knotenobjekts zurueck, aber auf die angegebene Laenge
     *  gekuerzt (bzw. mit Leerzeichen aufgefuellt), damit bei der Ausgabe die Spalten
     *  und Zeilen gleich breit sind, egal wie lange die Namen der Knoten sind.
     * 
     * @param i Anzahl der Zeichen, auf die der Bezeichner formatiert wird.
     * @return  formatierter Bezeichner
     */
    public String bezFormatGeben(int i) {
        int differenz = i-bezeichnung.length();
        if (differenz<0) {
            return bezeichnung.substring(0,i);
        }
        else  {
            String s = "";
            for (int z=0;z<differenz;z++) {
                s = s + " ";
            }                
            return bezeichnung +s;
        }
    }

}
