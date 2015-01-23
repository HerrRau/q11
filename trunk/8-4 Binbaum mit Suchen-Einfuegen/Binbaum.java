public class Binbaum {
    // Attribute
    Baumelement wurzel;
    
    // Konstruktoren
    public Binbaum() {
        wurzel = new Abschluss();
    }
    

    // Methoden
    public void einfuegen (Datenelement d) {
        wurzel = wurzel.einfuegen(d);
    }

    public Datenelement suchen(String s) {
        return wurzel.suchen(s);
    }

}
