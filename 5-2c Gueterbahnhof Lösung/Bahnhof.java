class Bahnhof 
{
    Stack gleis1 = new Liste();
    Stack gleis2 = new Liste();
    Stack gleis3 = new Liste();
    
    public Waggon neuerWaggon(String ziel, int wagennummer) {
        Waggon w = new Waggon(ziel, wagennummer);
        return w;        
    }
    
    public void neuerWaggonAufGleis(String ziel, int wagennummer, int gleis) {
        Waggon w = new Waggon(ziel, wagennummer);
        waggonHinzufuegen(w, gleis);
    }
    
    public void waggonHinzufuegen(Waggon w, int i) {
        if (i==1) {
            gleis1.vorneEinfuegen(w);
        }
        else if (i==2) {
            gleis2.vorneEinfuegen(w);
        }
        else if (i==3) {
            gleis3.vorneEinfuegen(w);
        }
        else {
            System.out.println("Das Gleis gibt es nicht.");
        }
    }

    public Waggon waggonEntfernen(int i) {
        if (i==1) {
            return (Waggon) gleis1.anfangEntfernen();
        }
        else if (i==2) {
            return (Waggon) gleis2.anfangEntfernen();
        }
        else if (i==3) {
            return (Waggon) gleis3.anfangEntfernen();
        }
        else {
            System.out.println("Das Gleis gibt es nicht.");
            return null;
        }
    }
    
    public void informationAusgeben() {
        System.out.println("Gleis 1:");
        gleis1.informationAusgeben();
        System.out.println();
        System.out.println("Gleis 2:");
        gleis2.informationAusgeben();
        System.out.println();
        System.out.println("Gleis 3:");
        gleis3.informationAusgeben();
        System.out.println();
        System.out.println("---------");
    }

}
