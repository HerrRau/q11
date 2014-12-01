public class Liste {

    //Attribute
    Knoten anfang;

    //Konstruktor
    Liste() {}

    //Methoden

    //vorne einfuegen
    void vorneEinfuegen(Datenelement dneu) {
        Knoten kneu;
        kneu = new Knoten (dneu, anfang);
        anfang = kneu;
    }

    //Laenge geben
    int laengeGeben () {
        if (anfang == null) {
            return 0;
        }
        else {
            return anfang.restlaengeGeben();
        }
    }
    
    int laengeGebenIterativ() {
        int zaehler = 0;
        Knoten aktuell = this.anfang;
        
        while (aktuell != null) {
            zaehler = zaehler + 1;
            aktuell = aktuell.nachfolger;
        }
        return zaehler;
        
    }

    //Information Ausgeben
    void informationAusgeben() {
        System.out.println("In der Liste stehen folgende Elemente:");
        if (anfang!=null) {
            anfang.informationAusgeben();
        }
    }

}
