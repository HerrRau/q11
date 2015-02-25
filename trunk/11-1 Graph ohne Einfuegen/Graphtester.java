public class Graphtester  {
    // Attribute
    public Graph_Matrix g;
    
    // Konstruktoren
    public Graphtester() {
        g = new Graph_Matrix(10);
    }

    // Methoden
     void testEinfuegen() {
        g.knotenEinfuegen("Augsburg");
        g.knotenEinfuegen("Moskau");
        g.knotenEinfuegen("FFB");
        g.knotenEinfuegen("Muenchen");
        g.ausgeben();

        g.kanteEinfuegen("Augsburg", "Moskau", 42);
        g.kanteEinfuegen("Moskau", "Augsburg", 999);
        g.kanteEinfuegen("Moskau", "Muenchen", 36);
        g.ausgeben();
     }

}
