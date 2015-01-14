public class Woerterbucheintrag implements Datenelement {
    // Attribute
    String wort;
    String bedeutung;
    
    // Konstruktoren
    public Woerterbucheintrag(String w, String b) {
        wort = w;
        bedeutung = b;
    }

    // Methoden
    public void informationAusgeben() {
        System.out.println (wort + ": " + bedeutung);
    } 
    
    //Methoden fuers Suchen
    public boolean schluesselIstGleich(String s) {
        if (wort.compareTo(s)==0) return true;
        else return false;
    } 
    public boolean schluesselIstGroesserAls(String s) {
        if (wort.compareTo(s)>0) return true;
        else return false;
    } 

    public boolean istKleinerAls(Datenelement d) {
        Woerterbucheintrag w = (Woerterbucheintrag) d; //Typumwandlung
        if (this.wort.compareTo(w.wort)<0) return true;
        else return false;
    } 
    public boolean istGroesserAls(Datenelement d) {
        Woerterbucheintrag w = (Woerterbucheintrag) d; //Typumwandlung
        if (this.wort.compareTo(w.wort)>0) return true;
        else return false;
    }

    public boolean istGleich(Datenelement d) {
        Woerterbucheintrag w = (Woerterbucheintrag) d; //Typumwandlung
        if (this.wort.compareTo(w.wort)==0) return true;
        else return false;
    } 

    public String bedeutungGeben() { return bedeutung; }

    public void bedeutungSetzen(String s) { bedeutung = s; }

}
