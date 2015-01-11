public interface Bahnhof
{
    public Waggon neuerWaggon(String ziel, int wagennummer);    
    public void waggonAufGleis(Waggon w, int i);
    public Waggon waggonVonGleis(int i);    
    public void informationAusgeben();

}

