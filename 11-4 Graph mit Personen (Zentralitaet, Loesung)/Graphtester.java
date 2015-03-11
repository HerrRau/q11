public class Graphtester  {
    // Attribute
    public Graph_Matrix g;

    // Konstruktoren
    public Graphtester() {
        g = new Graph_Matrix(25);
        personenEinfuegen();
    }

    // Methoden
    void personenEinfuegen() {
        g = new Graph_Matrix(25);

        g.knotenEinfuegen("Arlene");
        g.knotenEinfuegen("Ben");
        g.knotenEinfuegen("Carol");
        g.knotenEinfuegen("Dorothy");
        g.knotenEinfuegen("Elisabeth");
        g.knotenEinfuegen("Felicia");
        g.knotenEinfuegen("Guelsen");
        g.knotenEinfuegen("Hussein");
        g.knotenEinfuegen("Ihsan");
        g.knotenEinfuegen("Jakub");
        g.knotenEinfuegen("Karol");
        g.knotenEinfuegen("Linda");
        g.knotenEinfuegen("Michael");
        g.knotenEinfuegen("Nora");
        g.knotenEinfuegen("Oscar");
        g.knotenEinfuegen("Petra");
        g.knotenEinfuegen("Quentin");
        g.knotenEinfuegen("Rashid");
        g.knotenEinfuegen("Salomon");

        g.ausgeben();

        g.kanteEinfuegen("Elisabeth", "Guelsen",1);
        g.kanteEinfuegen("Hussein", "Linda",1);
        g.kanteEinfuegen("Hussein", "Petra",1);
        g.kanteEinfuegen("Jakub", "Ihsan", 1);
        g.kanteEinfuegen("Dorothy","Ihsan", 1);
        g.kanteEinfuegen("Petra", "Ihsan", 1);
        g.kanteEinfuegen("Ihsan","Arlene",1);
        g.kanteEinfuegen("Petra","Arlene",1);
        g.kanteEinfuegen("Arlene", "Rashid",1);
        g.kanteEinfuegen("Oscar", "Felicia",1);
        g.kanteEinfuegen("Carol", "Ben", 1);
        g.kanteEinfuegen("Carol","Oscar", 1);
        g.kanteEinfuegen("Ben", "Oscar",1);
        g.kanteEinfuegen("Quentin", "Oscar",1);
        g.kanteEinfuegen("Michael", "Nora",1);
        g.kanteEinfuegen("Nora", "Karol",1);
        g.kanteEinfuegen("Michael", "Karol",1);
        g.kanteEinfuegen("Linda", "Michael",1);
        g.kanteEinfuegen("Linda", "Nora",1);
        g.kanteEinfuegen("Linda", "Karol",1);
        g.kanteEinfuegen("Linda","Quentin",1);
        g.kanteEinfuegen("Linda","Petra",1);
        g.kanteEinfuegen("Guelsen","Linda", 1);
        g.kanteEinfuegen("Guelsen","Petra",1);
        g.kanteEinfuegen("Guelsen","Quentin",1);
        g.kanteEinfuegen("Quentin", "Petra",1);     
        g.kanteEinfuegen("Quentin", "Ihsan",1);     
        g.kanteEinfuegen("Ihsan", "Rashid",1);     
        g.kanteEinfuegen("Linda", "Salomon",1);     

        g.ausgeben();
        
        zentralitaetAusgeben();
    }
    
    
    void zentralitaetAusgeben() {
        g.zentralitaetAusgeben(); 
    }

}
