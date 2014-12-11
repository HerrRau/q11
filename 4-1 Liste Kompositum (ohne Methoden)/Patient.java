public class Patient implements Datenelement {
    //Attribute
    String name;
    
    //Konstruktor
    Patient(String s) {
        name = s;
    }
    
    //Methoden   
    public void informationAusgeben() {
        System.out.println(name);
    }
    
     public boolean schluesselIstGleich(String s) {
         if (name.equals(s)) return true;
         else return false;
     }

     public boolean istKleinerAls(Datenelement d) {
         Patient p = (Patient) d; //Typumwandlung, leider noetig
         if (name.compareTo(p.name)<0) return true;
         else return false;
    }

}
