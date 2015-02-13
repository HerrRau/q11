public class Adresse implements Datenelement{
    String nachname;
    String vorname;
    String email;
    String telefon;

    public Adresse(String n, String v, String e, String t){
        super();
        nachname=n;
        vorname=v;
        email=e;
        telefon=t;
    }

    public void telefonAendern(String tneu){
        telefon = tneu;
    }

    public void emailAendern(String eneu){
        email = eneu;
    }

    String emailGeben()
    {
        return email;
    }

    String telefonGeben()
    {
        return telefon;
    }

    String vornameGeben()
    {
        return vorname;
    }

    String nachnameGeben()
    {
        return nachname;
    }

    public String schluesselAlsStringGeben(){
        return nachname+", "+vorname;
    }

    public void informationAusgeben(){
        System.out.println (nachname+", "+vorname);
    } 

    public boolean schluesselIstGleich(String s){
        if ((nachname+", "+vorname).compareTo(s)==0) return true;
        else return false;
    }

    public boolean schluesselIstGroesserAls(String s){
        if ((nachname+", "+vorname).compareTo(s)>0) return true;
        else return false;
    }

    public boolean istKleinerAls(Datenelement d){
        if ((nachname+", "+vorname).compareTo((nachname+", "+vorname))<0) return true;
        else return false;
    }

    public boolean istGroesserAls(Datenelement d){
        if ((nachname+", "+vorname).compareTo((nachname+", "+vorname))>0) return true;
        else return false;
    }

    public boolean istGleich(Datenelement d){
        //if ((nachname+", "+vorname).compareTo((nachname+", "+vorname))==0) return true; //falsch, da das IMMER true ist
        Adresse a = (Adresse) d;
        if ((nachname+", "+vorname).compareTo((a.nachname+", "+a.vorname))==0) return true;
        else return false;
    }

}

