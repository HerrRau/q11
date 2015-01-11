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

    }
