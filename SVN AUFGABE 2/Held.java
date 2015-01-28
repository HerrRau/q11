
public class Held
{
    String name;
    boolean weiblich;
    int alter;
    int staerke;
    int geschicklichkeit;
    int intelligenz;
    Ross pferd;
    Waffe waffe;    
    
    public Held(String nameNeu, boolean weiblichNeu, int alterNeu, int staerkeNeu, int geschicklichkeitNeu, int intelligenzNeu)  {
        name = nameNeu;
        weiblich = weiblichNeu;
        alter = alterNeu;
        staerke = staerkeNeu;
        geschicklichkeit = geschicklichkeitNeu;
        intelligenz = intelligenzNeu;
        pferd = new Ross();
        waffe = new Waffe();
    }
    
    Waffe waffeGeben() {
        return waffe;
    }
    
    void waffeSetzen(Waffe waffeNeu) {
        waffe = waffeNeu;
    }
    
    int alterGeben() {
        return alter;
    }
    
    void alterSetzen(int alterNeu) {
        alter = alterNeu;
    }

    Ross pferdGeben(){
        return pferd;
    }
    
    void pferdSetzen(Ross pferdNeu) {
        pferd = pferdNeu;
    }
    
    int staerkeGeben(){
    return staerke;
    }
    
    void staerkeSetzen(int staerkeNeu){
        staerke = staerkeNeu;
    }
    //Stephan.eli.paul sind horny - das wissen wir doch alle :*
    
    void intelligenzSetzen (int Intelligenzgrad){
        intelligenz = Intelligenzgrad;
    }



}
