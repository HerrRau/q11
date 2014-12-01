public class Knoten extends Listenelement {
    //Attribute
    Datenelement daten;
    Listenelement nachfolger;

    
    //Konstruktor
    Knoten (Datenelement d, Listenelement k) {
        daten = d;
        nachfolger = k;
    }

    
    //Methoden
    public int restlaengeGeben() {
        return nachfolger.restlaengeGeben() +1;
    }

    public Datenelement suchen(String s) {
        if (daten.schluesselIstGleich(s)) {
            return daten;
        } 
        else {
                return nachfolger.suchen(s);
        }        
    }
        
    public Knoten einfuegenVor(Datenelement dneu, Datenelement dvor) {
        if(daten == dvor) {
            Knoten kneu;
            kneu = new Knoten(dneu, this);
            return kneu;
        }
        else  {
            nachfolger = nachfolger.einfuegenVor(dneu, dvor);
            return this;
        }    
    }
    
    public Knoten sortiertEinfuegen(Datenelement d) {
        if (daten.istKleinerAls(d)) {
                nachfolger = nachfolger.sortiertEinfuegen(d);
            return this;
        }
        else {
            Knoten k = new Knoten (d,this);
            return k;
        }
    }
    
    public Datenelement datenelementGeben() {
        return daten;
    }
    
    public Listenelement nachfolgerGeben() { 
        return nachfolger;
    }
    
    public Listenelement knotenEntfernen(Datenelement d) { 
        if (daten==d) return nachfolger;
        else {
            nachfolger = nachfolger.knotenEntfernen(d);
            return this;                
        }
    }
    
    public void informationAusgeben() {
        daten.informationAusgeben();
        nachfolger.informationAusgeben();
    }

    //to do
//     public Knoten hintenEinfuegen(Datenelement dneu) {
//     }

//     public Datenelement endeGeben(Datenelement d) {
//    }    

//     public Listenelement endeEntfernen(Datenelement d) {
//      }
    
  // Ende Methoden
}
