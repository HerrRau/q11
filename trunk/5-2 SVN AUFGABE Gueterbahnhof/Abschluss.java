public class Abschluss extends Listenelement {

    //NEU:
    public Knoten hintenEinfuegen (Datenelement d) {
        Knoten kneu;
        kneu = new Knoten(d, this);
        return kneu;
    }
    

    public Knoten einfuegenVor(Datenelement dneu, Datenelement dvor) {
        Knoten kneu;
        kneu = new Knoten(dneu, this);
        return kneu;
    }    
    
    public Knoten sortiertEinfuegen(Datenelement dneu) {
        //laueft auf das gleiche heraus wie hinten einfuegen
        Knoten kneu = new Knoten (dneu, this);
        return kneu;
    }    
    
    
    public Listenelement knotenEntfernen(Datenelement d) {
        // im Prinzip bleibt ja alles unveraendert
        return this;
    }    

    
    //NEU:
    public Datenelement endeGeben(Datenelement d) {
        return d;
    }
    
    //NEU:
    public Listenelement endeEntfernen(Datenelement d) {
        return this;
    }
        
    
    public Datenelement suchen(String s) {
        return null;
    }
    
    public int restlaengeGeben()  {
        return 0;
    }
    

    
    //die einfachen nicht-rekursiven Methoden
    
    public Datenelement datenelementGeben() {
        return null;
     } 
    
    public Listenelement nachfolgerGeben() {
        return this;
    }
    
    public void informationAusgeben() {
    } 

}