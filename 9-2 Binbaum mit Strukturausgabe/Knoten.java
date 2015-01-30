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
    public Baumelement  einfuegen(Datenelement d) {
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
    
    public int tiefeGeben(String s, int i) {
        if (daten.schluesselIstGleich(s)) return i;
        else {
            if (daten.schluesselIstGroesserAls(s)) return linkerNachfolger.tiefeGeben(s, i+1);
            else return rechterNachfolger.tiefeGeben(s, i+1);
        }
    }
    
    public void strukturAusgeben(int einrueckungszahl) {
        String einrueckung = "";
        for (int z=0; z<einrueckungszahl; z++) {
            einrueckung = einrueckung + "   ";
        }
        System.out.println(einrueckung + daten.schluesselAlsStringGeben());
        linkerNachfolger.strukturAusgeben(einrueckungszahl+1);
        rechterNachfolger.strukturAusgeben(einrueckungszahl+1);
    }

}
        
