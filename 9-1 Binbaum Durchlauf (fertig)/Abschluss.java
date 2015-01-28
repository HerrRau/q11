public class Abschluss extends Baumelement {
    // Attribute
    
    // Konstruktoren
    public Abschluss() {
    }

    // Methoden
    public Baumelement  einfuegen(Datenelement d) {
        Knoten k = new Knoten(d);
        return k;
    }
    public Datenelement suchen(String s) {
        return null;
    }
    
    public void inorderAusgeben() {
    }
    public void preorderAusgeben() {
    }
    public void postorderAusgeben() {
    }


    }
