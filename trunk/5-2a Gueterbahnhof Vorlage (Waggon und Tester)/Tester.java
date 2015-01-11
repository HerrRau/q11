public class Tester
{    
    Bahnhof b = new Bahnhof();
    
    public Tester() {
        Waggon w1 = new Waggon("Muenchen", 4567);
        b.waggonHinzufuegen(w1,1);
        Waggon w2 = b.waggonEntfernen(1);
        b.waggonHinzufuegen(w2,2);
        
        
    }

}
