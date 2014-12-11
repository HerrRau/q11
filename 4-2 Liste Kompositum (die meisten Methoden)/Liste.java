public class Liste {
    //Attribute
    Listenelement anfang;
    
    //Konstruktor
    Liste() {
        anfang = new Abschluss();
    }

    //Methoden
    
    public int laengeGeben() {
        return anfang.restlaengeGeben();
    }

    public void vorneEinfuegen(Datenelement d) {
        Knoten kneu;
        kneu = new Knoten(d, anfang);
        anfang = kneu;
    }
    
    public Datenelement suchen (String s) {
            return anfang.suchen(s); 
    }        
    
    public void einfuegenVor(Datenelement dneu, Datenelement d_vergleich) {
            anfang = anfang.einfuegenVor(dneu, d_vergleich);
    }
    
    public void sortiertEinfuegen(Datenelement d) {
            anfang = anfang.sortiertEinfuegen(d);
    }
    
    public Datenelement anfangEntfernen() {
             Datenelement temp = anfang.datenelementGeben();
             anfang = anfang.nachfolgerGeben();
             return temp;
    }
    
    public void knotenEntfernen(Datenelement d) {
            anfang = anfang.knotenEntfernen(d);
    }
    
    public void informationAusgeben() {
            anfang.informationAusgeben();
    }
    
    //To do: 
//     public void hintenEinfuegen(Datenelement dneu) {
//     }

//     public Datenelement endeEntfernen() {
//      }

}
