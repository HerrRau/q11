import java.util.*;


public class Demo
{
    public Demo()
    {
        // das mit den spitzen Klammern heisst "generics" und gibt an, dass in die Beispielqueue
        // in diesem Fall nur String-Objekte hinein duerfen
        
        //bei folgenden Klassen man - nur - die Methoden "informationAusgeben",
        //"anfangEntfernen" und "hintenEinfuegen" benutzen
        Queue q1 = new Liste();             //benutzt unsere Liste
        Queue q2 = new Warteschlange();     //benutzt - sinnloser Weise - unsere sinnlose Klasse
        Queue q3 = new AdapterQueue();      //benutzt den Adapter, der intern alles an eine ArrayDeque weitergibt
        
        
        //bei folgenden Klassen kann man stattdessen die Methoden "add" und "remove" verwenden
        //das "java.util." vorne macht klar, dass es um das Java-interne Queue-Interface geht, 
        //und nicht um unser eigenes Interface im BlueJ-Projekt, das ja genauso heisst
        java.util.Queue<Datenelement> q4 = new ArrayDeque<Datenelement>();
        java.util.Queue<Datenelement> q5 = new PriorityQueue<Datenelement>();
        java.util.Queue<Datenelement> q6 = new LinkedList<Datenelement>();
        
        //Wenn man ohne interfaces arbeitet, kann man auch schreiben:
        AdapterQueue q7 = new AdapterQueue();   //benutzt unsere Liste
        Liste q8 = new Liste();                 //Problem: zu viele Methoden ansprechbar
        Warteschlange q9 = new Warteschlange(); //Problem: zu viele Methoden ansprechbar
        
        Patient p = new Patient("Wolfram von Eschenbach");
        q1.hintenEinfuegen(p);
        q2.hintenEinfuegen(p);
        q3.hintenEinfuegen(p);
        q1.informationAusgeben();
        q2.informationAusgeben();
        q3.informationAusgeben();
        
        q4.add(p);
        q5.add(p);
        q6.add(p);
        System.out.println(q4.size());
        System.out.println(q5.size());
        System.out.println(q6.size());
        
        q1.anfangEntfernen();
        q2.anfangEntfernen();
        q3.anfangEntfernen();
        q1.informationAusgeben();
        q2.informationAusgeben();
        q3.informationAusgeben();
        
        q4.remove();
        q5.remove();
        q6.remove();
        System.out.println(q4.size());
        System.out.println(q5.size());
        System.out.println(q6.size());
        
        
  
    }
}


