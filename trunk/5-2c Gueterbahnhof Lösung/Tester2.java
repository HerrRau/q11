public class Tester2
{
    Bahnhof bahnhof;
    
    public Tester2() {
        bahnhof = new Bahnhof();
        
        Waggon w1 = bahnhof.neuerWaggon("Augsburg", 1112);
        Waggon w2 = bahnhof.neuerWaggon("Muenchen", 1113);
        Waggon w3 = bahnhof.neuerWaggon("Diedorf", 1114);
        Waggon w4 = bahnhof.neuerWaggon("Ingolstadt", 1115);
        
        bahnhof.waggonHinzufuegen(w1, 1);
        bahnhof.waggonHinzufuegen(w2, 1);
        bahnhof.waggonHinzufuegen(w3, 1);
        bahnhof.waggonHinzufuegen(w4, 1);
        
        bahnhof.informationAusgeben();
        
        bahnhof.waggonEntfernen(1);
        bahnhof.waggonEntfernen(1);
        
        bahnhof.informationAusgeben();

        
        
    }
}
