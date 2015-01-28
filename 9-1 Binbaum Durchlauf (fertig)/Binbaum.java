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
    
    public void inorderAusgeben() {
        wurzel.inorderAusgeben();
    }
    public void preorderAusgeben() {
            wurzel.preorderAusgeben();
    }
    public void postorderAusgeben() {
        wurzel.postorderAusgeben();
    }
}