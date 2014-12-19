import java.util.*;

public class AdapterQueue implements Queue
{
    java.util.Queue<Datenelement> q;
    
    public AdapterQueue()
    {
        q = new LinkedList<Datenelement>(); //auch moeglich: ArrayDeque(); PriorityQueue();
    }
    
    public void informationAusgeben () {
        for (Datenelement d : q) {
            d.informationAusgeben();
        }
    }
    
    public void hintenEinfuegen(Datenelement d) {
        q.add(d);
    }
    
    public Datenelement anfangEntfernen() {
        if (q.size()>0) return q.remove();        
        else return null;
    }

}