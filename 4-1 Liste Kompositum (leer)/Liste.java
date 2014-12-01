public class Liste {
    //Attribute
    Knoten anfang;
    
    //Konstruktor
    Liste() {}
    

    
    //Methoden
    
//     //Laenge der Liste
//     public int laengeGeben() {
//         if (anfang==null) return 0;
//         else return anfang.restlaengeGeben();
//     }
// 
//     // Datenelement vorne einfuegen 
//     public void vorneEinfuegen(Datenelement d) {
//         // ein neuer Knoten wird erzeugt mit dem Datenelement d und
//         // als Nachfolger dem bisherigen Anfang
//         Knoten kneu;
//         kneu = new Knoten(d, anfang);
//         // danach wird der Anfang der Liste aktualisiert, so dass er 
//         // auf den neuen Knoten zeigt
//         anfang = kneu;
//     }
//     
//     //nach einem Element ueber das Schluesselatribut suchen
//     public Datenelement suchen (String s) {
//         if (anfang==null) return null;
//         else return anfang.suchen(s); 
//     }
//         
//     public void hintenEinfuegen(Datenelement dneu) {
//         if (anfang != null) {
//             anfang.hintenEinfuegen(dneu);
//         }
//         else {
//             vorneEinfuegen(dneu);
//         }
//     }
//     
//     public void informationAusgeben() {
//         System.out.println("Die Liste enthält folgende Elemente:");
//         if (anfang!=null) {
//             anfang.informationAusgeben();
//         }
//         System.out.println("-----------------------");
//         
//     }
//     
//     public void einfuegenVor(Datenelement dneu, Datenelement d_vergleich) {
//         if (anfang != null) {
//             //hier geschehen zwei Dinge
//             //1. die Aufgabe wird an den Anfang weitergereicht
//             //2. sobald eine Antwort kommt, den Wert des Attributs anfang ändern
//             anfang = anfang.einfuegenVor(dneu, d_vergleich);
//         }
//         else {
//             vorneEinfuegen(dneu);
//         }
//     }
//     
//     //neu
//         public void sortiertEinfuegen(Datenelement d) {
//         if (anfang!=null) anfang = anfang.sortiertEinfuegen(d);
//         else vorneEinfuegen(d);
//     }
//     
//     public Datenelement anfangEntfernen() {
//         if (anfang!=null) {
//              Datenelement temp = anfang.datenelementGeben();
//              anfang = anfang.nachfolgerGeben();
//              return temp;
//         }
//         else return null;        
//     }
//     
//     public Datenelement endeEntfernen() {
//         if (anfang==null) return null;
//         else {
//             Datenelement temp = anfang.endeGeben();
//             anfang = anfang.endeEntfernen();
//             return temp;            
//         }
//     }
// 
//     public void knotenEntfernen(Datenelement d) {
//         if (anfang != null) {
//             anfang = anfang.knotenEntfernen(d);
//         }
//     }

    
    
}
