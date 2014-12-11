public class Liste {
    //Attribute
    Listenelement anfang;
    
    //Konstruktor
    Liste() {
        anfang = new Abschluss();
    }

    //Methoden
    
    void umdrehen () {
        if (laengeGeben()>0) {
            Datenelement d = endeEntfernen(); 
            umdrehen();
            vorneEinfuegen(d);
        }
    }    
    
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
        
    //NEU: 
    public void hintenEinfuegen(Datenelement dneu) {
            anfang = anfang.hintenEinfuegen(dneu);
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
    
    
    // NEU:
     public Datenelement endeEntfernen() {
         Datenelement temp;
         temp = anfang.endeGeben(null);
         anfang = anfang.endeEntfernen(temp);
         return temp;            
     }

    public void knotenEntfernen(Datenelement d) {
            anfang = anfang.knotenEntfernen(d);
    }
    
    public void informationAusgeben() {
            anfang.informationAusgeben();
    }
}
