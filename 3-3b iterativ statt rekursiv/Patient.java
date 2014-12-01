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
    
}
