public class Adresse  {
    String nachname;
    String vorname;
    String email;
    String telefon;
    
    public Adresse(String n, String v, String e, String t){
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
    
    public String emailGeben(){
        return email;
    }
    
    public String telefonGeben(){
        return telefon;
    }
    
    public String vornameGeben(){
        return vorname;
    }
    
    public String nachnameGeben(){
        return nachname;
    }
    
    public String schluesselAlsStringGeben(){
        return nachname+", "+vorname;
    }
}
