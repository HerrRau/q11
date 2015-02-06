public class MyController extends ControllerUmsetzung
{
    public MyController()
    {
        super();
    }

    public void emailAendern(String schluessel, String mail) {
        if (model !=null) model.emailAendern(schluessel, mail);
        else view.kommentarAnzeigen("Fehler: Noch kein Model vorhanden.");
    }

    public void telefonAendern(String schluessel, String fon) {
        if (model !=null) model.telefonAendern(schluessel, fon);
        else view.kommentarAnzeigen("Fehler: Noch kein Model vorhanden.");
    }

    public void adresseSuchen (String schluessel) {
        if (model !=null) view.adresseAnzeigen( model.adresseSuchen(schluessel) );
        else view.kommentarAnzeigen("Fehler: Noch kein Model vorhanden.");
    }

    public void adresseEintragen (Adresse a) {
        if (model !=null) {
           if (model.adresseSuchen(a.schluesselAlsStringGeben()) == null)
            { model.adresseEintragen(a);
                view.kommentarAnzeigen("Die Adresse wurde erfolgreich eingetragen"); }
            else { view.kommentarAnzeigen("Diese Adresse gibt es bereits"); }}
            else { view.kommentarAnzeigen("Fehler: Noch kein Model vorhanden."); } 
        }
    }

