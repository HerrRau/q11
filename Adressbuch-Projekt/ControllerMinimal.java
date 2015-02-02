public class ControllerMinimal extends ControllerUmsetzung
{
    public ControllerMinimal()
    {
        super();
    }
    
    public void emailAendern(String schluessel, String mail) {
        if (model !=null) model.emailAendern(schluessel, mail);
        else System.out.println("Fehler: Noch kein Model vorhanden.");
    }
    public void telefonAendern(String schluessel, String fon) {
        if (model !=null) model.telefonAendern(schluessel, fon);
        else System.out.println("Fehler: Noch kein Model vorhanden.");
    }
    public void adresseSuchen (String schluessel) {
        if (model !=null) view.adresseAnzeigen( model.adresseSuchen(schluessel) );
        else System.out.println("Fehler: Noch kein Model vorhanden.");
    }
    public void adresseEintragen (Adresse a) {
        if (model !=null) model.adresseEintragen(a);
        else System.out.println("Fehler: Noch kein Model vorhanden.");
    }

}
