public class Knoten extends Baumelement {
    // Attribute
    Baumelement linkerNachfolger;
    Baumelement rechterNachfolger;
    Datenelement daten;
    
    // Konstruktoren
    public Knoten(Datenelement d) {
        super(); //hier ueberfluessig
        daten = d;
        linkerNachfolger= new Abschluss();
        rechterNachfolger= new Abschluss();
    }

    // Methoden

    }
