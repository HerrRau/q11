public class Schuelerverwaltung
{
    public Liste l;

    public Schuelerverwaltung() {
        l = new Liste();
    }
    
    public void schuelerHinzufuegen(String nachname, String vorname) {
        Datenelement d = new Schueler(nachname, vorname);
        l.sortiertEinfuegen(d);
        l.informationAusgeben();     
    }
    
    public void schuelerEntfernen(String nachname, String vorname) {
        Schueler s = (Schueler) l.suchen(nachname+", "+vorname); //mit Typumwandlung
        l.knotenEntfernen(s);
        l.informationAusgeben();     
    }
}
