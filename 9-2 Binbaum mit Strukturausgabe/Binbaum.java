public class Binbaum {
    // Attribute

  // Anfang Attribute
    Baumelement wurzel;
  // Ende Attribute


    // Konstruktoren
    public Binbaum() {
        wurzel = new Abschluss();
    }

  // Anfang Methoden


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

    public int tiefeGeben(String s) {
        return wurzel.tiefeGeben(s, 0);
    }
    
    public void strukturAusgeben() {
        wurzel.strukturAusgeben(0);
    }
  // Ende Methoden


}