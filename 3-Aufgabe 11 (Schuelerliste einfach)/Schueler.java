public class Schueler implements Datenelement
{
    String vorname;
    String nachname;
    
    public Schueler(String nachname, String vorname)
    {
        this.nachname = nachname;
        this.vorname = vorname;
    }
    
    public void informationAusgeben() {
        System.out.println(vorname+" "+nachname);
    }
    
    public boolean schluesselIstGleich(String s) {
        //koennte man auch anders machen
        return (s.compareTo(nachname+", "+vorname)==0);
    }

    public boolean istKleinerAls(Datenelement d) {
        Schueler temp = (Schueler) d;
        if (this.nachname.compareTo(temp.nachname)<0) return true;
        else if (this.nachname.compareTo(temp.nachname)>0) return false;
        else {
            if (this.vorname.compareTo(temp.vorname)<0) return true;
            else return false;
        }
    }
}
