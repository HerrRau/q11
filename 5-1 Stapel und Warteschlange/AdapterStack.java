import java.util.*;

public class AdapterStack implements Stack
{
    java.util.Deque<Datenelement> s;
    
    public AdapterStack()
    {
        s = new LinkedList<Datenelement>(); //auch moeglich: ArrayDeque(); PriorityQueue();
    }
    
    public void informationAusgeben () {
        for (Datenelement d : s) {
            d.informationAusgeben();
        }
    }
    
    public void vorneEinfuegen(Datenelement d) {
        s.push(d);
    }
    
    public Datenelement anfangEntfernen() {
        if (s.size()>0) return s.pop();        
        else return null;
    }

}