public class Tester
{    
    Bahnhof bahnhof;
    
    public Tester(Bahnhof b) {
        
        bahnhof = b;
        
        Waggon w1 = new Waggon("Muenchen", 4567);
        bahnhof.waggonHinzufuegen(w1,1);
        Waggon w2 = b.waggonEntfernen(1);
        bahnhof.waggonHinzufuegen(w2,2);
        
        
    }

}
