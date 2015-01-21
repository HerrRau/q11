public class Knoten extends Baumelement {
    // Attribute
    Baumelement linkerNachfolger;
    Baumelement rechterNachfolger;
    Datenelement daten;
    
    // Konstruktoren
    public Knoten(Datenelement d) {
        daten = d;
        linkerNachfolger= new Abschluss();
        rechterNachfolger= new Abschluss();
    }

    // Methoden
    public Baumelement einfuegen(Datenelement d) {
        if (daten.istGleich(d)) System.out.println("Gibt's schon.");
        else {
            if (daten.istGroesserAls(d)) linkerNachfolger=linkerNachfolger.einfuegen(d);
            else rechterNachfolger=rechterNachfolger.einfuegen(d);
        } 
        return this;
    }
    
     public Datenelement suchen(String s) {
         return null;
     }
}
        
