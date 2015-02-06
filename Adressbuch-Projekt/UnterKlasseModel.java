public class UnterKlasseModel extends ModelUmsetzung
{    
    Binbaum binbaum;

    public UnterKlasseModel()
    {
        super();
        binbaum = new Binbaum();
    }

    public void adresseEintragen(Adresse a) {
        binbaum.einfuegen(a);
    }

    public Adresse adresseSuchen(String suchschluessel) {
        return (Adresse) binbaum.suchen(suchschluessel);
    }

    public void emailAendern(String suchschluessel, String email) {
        Adresse a = (Adresse)binbaum.suchen(suchschluessel);
        a.emailAendern(email);
    }

    public void telefonAendern(String suchschluessel, String telefon) {
        Adresse a = (Adresse) binbaum.suchen(suchschluessel);
        a.telefonAendern(telefon);
    }

}
