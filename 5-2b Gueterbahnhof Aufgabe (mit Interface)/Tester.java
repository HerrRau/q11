public class Tester
{
    Bahnhof bahnhof;
    
    public Tester(Bahnhof b) {
        bahnhof = b;
        
        Waggon w1 = bahnhof.neuerWaggon("Augsburg", 1112);
        Waggon w2 = bahnhof.neuerWaggon("Muenchen", 1113);
        Waggon w3 = bahnhof.neuerWaggon("Diedorf", 1114);
        Waggon w4 = bahnhof.neuerWaggon("Ingolstadt", 1115);
        
        bahnhof.waggonAufGleis(w1, 1);
        bahnhof.waggonAufGleis(w2, 1);
        bahnhof.waggonAufGleis(w3, 1);
        bahnhof.waggonAufGleis(w4, 1);
        
        bahnhof.informationAusgeben();
        
        bahnhof.waggonVonGleis(1);
        bahnhof.waggonVonGleis(1);
        bahnhof.waggonVonGleis(1);
        
        bahnhof.informationAusgeben();
    
    }
}
