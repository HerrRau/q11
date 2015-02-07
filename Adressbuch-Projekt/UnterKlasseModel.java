public class UnterKlasseModel extends ModelUmsetzung
{    
    Binbaum binbaum;

    public UnterKlasseModel()
    {
        super();
        binbaum = new Binbaum();
    }

    public void adresseEintragen(Adresse a) {
        // gibt zur Zeit noch Fehler, da die Klasse Adresse bisher nicht
        // von Datenelement erbt, der Binbaum aber nur Datenelemente einfuegen
        // kann - also muss erst der Code in der Klasse Adresse geaendert werden
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
