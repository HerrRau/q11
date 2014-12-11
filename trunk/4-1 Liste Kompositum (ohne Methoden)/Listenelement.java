public abstract class Listenelement {
        
    //einfache Einfuegemethoden
    public abstract Knoten einfuegenVor(Datenelement dneu, Datenelement dvor);
    public abstract Knoten sortiertEinfuegen(Datenelement d);
    
    //Loeschmethode
    public abstract Listenelement knotenEntfernen(Datenelement d); // neu: wenn die Liste nur 1 lang war, wird Abschluss zurueckgegeben - daher Rueckgabetyp Listenelement    
    
    public abstract Datenelement suchen(String s); //unveraendert
    public abstract int restlaengeGeben(); //unveraendert 

    //die einfachen nicht-rekursiven Methoden
    public abstract Datenelement datenelementGeben();  //unveraendert 
    public abstract Listenelement nachfolgerGeben(); // neu: kann ein Knoten oder ein Abschluss sein
    public abstract void informationAusgeben();  //unveraendert 
    
    //spater mal, weil schwierig
//     public abstract Knoten hintenEinfuegen (Datenelement d); // frueher: void // spaeter mal machen
//     public abstract Datenelement endeGeben(Datenelement d); // spaeter mal machen
//     public abstract Listenelement endeEntfernen(Datenelement d); // spaeter mal machen
}
