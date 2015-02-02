public class Knoten {
    //Attribute
    Datenelement daten;
    Knoten nachfolger;
    
    //Konstruktor
    //neu: enthaelt als Argument einen Verweis auf den zu setzenden Nachfolger
    public Knoten (Datenelement d, Knoten k) {
        daten = d;
        nachfolger = k;
    }
    
    //Methoden

    public int restlaengeGeben() {
        if (nachfolger == null) {
            return 1;
        }
        else {
            return nachfolger.restlaengeGeben()+1;
        }
    }

    public Datenelement suchen(String s) {
        if (daten.schluesselIstGleich(s)) {
            return daten;
        } 
        else {
            if (nachfolger != null) {
                return nachfolger.suchen(s);
            }
            else {
                return null;
            }
        }        
    }
    
    public void hintenEinfuegen(Datenelement dneu) {
        if (nachfolger != null) nachfolger.hintenEinfuegen(dneu);
        else {
            Knoten kneu = new Knoten (dneu, null);
            nachfolger = kneu;
        }
    }
    
    public void informationAusgeben() {
        daten.informationAusgeben();
        if (nachfolger!=null) {
            nachfolger.informationAusgeben();
        }
    }
    
    public Knoten einfuegenVor(Datenelement dneu, Datenelement d_vergleich) {
        //ueberpruefen, ob das eigene Datenelement das ist, vor dem das neue eingefuegt werden soll
        if (daten == d_vergleich) {
            // wenn ja, dann 2 Sachen:
            // 1. neuen Knoten erzeugen und korrekt einbauen
            // 2. den Knoten als Antwort zurueckliefern - weil der gebraucht wird
            Knoten kneu;
            kneu = new Knoten(dneu, this);
            return kneu;
        }
        else {
            //wenn nein, und wenn es überhaupt einen Nachfolger gibt, dann 2 Sachen:
            if (nachfolger !=null) {
                // 1. Aufgabe an nachfolger weiterreichen
                // 2. wenn von dem Antwort kommt, das eigene nachfolger-Attribut aendern
                nachfolger = nachfolger.einfuegenVor(dneu, d_vergleich);
            }
            //sonst halt am Schluss einfügen
            else {
                hintenEinfuegen(dneu);
            }
            //so oder so: sich selber als Antwort zurueckmelden
            return this;
        }
    }
    
    //neu
        public Knoten sortiertEinfuegen(Datenelement d) {
        if (daten.istKleinerAls(d)) {
            if (nachfolger!=null) nachfolger = nachfolger.sortiertEinfuegen(d);
            else hintenEinfuegen(d);
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
    
    public Knoten nachfolgerGeben() {
        return nachfolger;
    }
    
    public Datenelement endeGeben() {
        if (nachfolger==null) return daten;
        else return nachfolger.endeGeben();
    }
    
    public Knoten endeEntfernen() {
        if (nachfolger != null) {
            nachfolger = nachfolger.endeEntfernen();
            return this;
        }
        else {
            return null;
        }            
    }
    
    public Knoten knotenEntfernen(Datenelement d) {
        if (daten==d) return nachfolger;
        else {
//umstandlich:
//             if (nachfolger!=null) {
//                 nachfolger = nachfolger.knotenEntfernen(d);
//                 return this;
//             }
//             else return this;                
//         }
//kuerzer:
            if (nachfolger!=null) nachfolger = nachfolger.knotenEntfernen(d);
            return this;                
        }
    }

    
    

    
}
