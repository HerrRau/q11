public interface Bahnhof
{
    public Waggon neuerWaggon(String ziel, int wagennummer);    
    public void waggonHinzufuegen(Waggon w, int i);
    public Waggon waggonEntfernen(int i);    
    public void informationAusgeben();

}

