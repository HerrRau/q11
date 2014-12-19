import java.util.*;


public class Demo
{
    public Demo()
    {
        // das mit den spitzen Klammern heisst "generics" und gibt an, dass in die Beispielqueue
        // in diesem Fall nur String-Objekte hinein duerfen
        java.util.Queue<String> q1 = new ArrayDeque<String>();
        java.util.Queue<String> q2 = new PriorityQueue<String>();
        java.util.Queue<String> q3 = new LinkedList<String>();
        
        q1.add(new String("Hallo"));
        q1.add("Welt");
        System.out.println(q1.isEmpty());
        System.out.println(q1.size());
        
        System.out.println(q1.toArray()[0]);
        System.out.println(q1.toArray()[1]);

    }
}


