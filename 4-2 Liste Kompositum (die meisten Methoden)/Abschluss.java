public class Abschluss extends Listenelement {
    

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

    //to do: endeEntfernen, endeGeben, hintenEinfuegen
    
}