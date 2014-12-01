public class Knoten {
    //Attribute

    Datenelement daten;
    Knoten nachfolger;


    //Konstruktor - verlangt zwei Argumente fuer die im Konstruktor erfolgende
    //Zuweisung der beiden Attribute (Daten und Folgeknoten)
    Knoten(Datenelement d, Knoten k) {
        daten = d;
        nachfolger = k;
    }
    
    //Methoden
    void informationAusgeben() {
        daten.informationAusgeben();
        if (nachfolger!=null) {
            nachfolger.informationAusgeben();
        }
    }
    
    int restlaengeGeben() {
        if (nachfolger == null) {
            return 1;
        }
        else {
            return nachfolger.restlaengeGeben() + 1;
        }
    }
    

    
    

}
