
public class ViewMinimal implements View   
{

    Controller controller;

    public ViewMinimal()
    {
    }

    public void controllerSetzen(Controller c) {
        this.controller = c;
    }

    // Ansprache (durch das Model)

    public void anzahlEintraegeEmpfangen(int i) {
        this.anzahlEintraegeAnzeigen(i);        
    }

    // Methoden zur Anzeige
    public void kommentarAnzeigen(String s) {
        System.out.println("Kommentar: "+s);
        System.out.println("==============");
    }

    public void anzahlEintraegeAnzeigen(int i) {
        System.out.println("Es gibt "+i+" Eintraege im Telefonbuch.");        
        System.out.println("==============");
    }

    public void adresseAnzeigen(Adresse a) {
        //         System.out.println("Nachname: "+a.nachnameGeben());
        //         System.out.println("Vorname: "+a.vornameGeben());
        //         System.out.println("E-Mail: "+a.emailGeben());
        //         System.out.println("Telefon: "+a.telefonGeben());
        //         System.out.println("==============");
    }

    
    // ab hier Methoden zur Kommunikation mit Controller

    public void adresseEintragenSenden(Adresse a) {
        if (controller !=null) controller.adresseEintragen(a);
    }

    public void adresseSuchenSenden(String suchschluessel) {
        if (controller !=null) controller.adresseSuchen(suchschluessel);
    }

    public void telefonAendernSenden(String suchschluessel, String telefon) {
        if (controller !=null) controller.telefonAendern(suchschluessel, telefon);
    }

    public void emailAendernSenden(String suchschluessel, String email) {
        if (controller !=null) controller.emailAendern(suchschluessel, email);
    }

}
