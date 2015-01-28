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
        if (daten.schluesselIstGleich(s)) return daten;
        else {
            if (daten.schluesselIstGroesserAls(s)) return linkerNachfolger.suchen(s);
            else return rechterNachfolger.suchen(s);
        }
    }
    
    public void inorderAusgeben() {
        linkerNachfolger.inorderAusgeben();
        daten.informationAusgeben();
        rechterNachfolger.inorderAusgeben();
    }
    public void preorderAusgeben() {
        daten.informationAusgeben();
        linkerNachfolger.inorderAusgeben();
        rechterNachfolger.inorderAusgeben();
    }
    public void postorderAusgeben() {
        linkerNachfolger.inorderAusgeben();
        rechterNachfolger.inorderAusgeben();
        daten.informationAusgeben();
    }

}
        
