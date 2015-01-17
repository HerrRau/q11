public class Waggon implements Datenelement {
    //Attribute
    String ziel;
    int nummer ;
    
    //Konstruktor
    Waggon(String s, int i) {
        nummer = i;
        ziel = s;
    }
    
    //Methoden   
    public void informationAusgeben() {
        System.out.println("Nummer "+nummer+" ("+ ziel +")");
    }
    
     public boolean schluesselIstGleich(String s) {
         return false;
     }
     public boolean istKleinerAls(Datenelement d) {
         return false;
    }

}
