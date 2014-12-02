

/**
 * The test class Tester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Tester extends junit.framework.TestCase
{
    private Patient patient1;
    private Patient patient2;
    private Patient patient3;
    private Liste liste1;

    /**
     * Default constructor for test class Tester
     */
    public Tester()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp()
    {
        patient1 = new Patient("Max");
        patient2 = new Patient("Moritz");
        patient3 = new Patient("Peterchen");
        liste1 = new Liste();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown()
    {
    }

    public void testInformationAusgeben()
    {
        System.out.println("*****************");
        System.out.println("Test Informationsausgabe");
        liste1.vorneEinfuegen(patient3);
        liste1.vorneEinfuegen(patient2);
        liste1.vorneEinfuegen(patient1);
        liste1.informationAusgeben();
    }

    public void testHintenEinfuegenLeereListe()
    {
        System.out.println("---------------");
        System.out.println("Test Einfügen am Ende (leere Liste)");
        liste1.hintenEinfuegen(patient1);
        liste1.informationAusgeben();
    }

    public void testHintenEinfuegenVolleListe()
    {
        System.out.println("---------------");
        System.out.println("Test Einfügen am Ende (volle Liste)");
        liste1.hintenEinfuegen(patient1);
        liste1.hintenEinfuegen(patient2);
        liste1.hintenEinfuegen(patient3);
        liste1.informationAusgeben();
    }

    public void testVorneEinfuegenVolleListe()
    {
        System.out.println("---------------");
        System.out.println("Test Einfügen am Anfang (volle Liste)");
        liste1.vorneEinfuegen(patient3);
        liste1.vorneEinfuegen(patient2);
        liste1.vorneEinfuegen(patient1);
        liste1.informationAusgeben();
    }

    public void testVorneEinfuegenLeereListe()
    {
        System.out.println("---------------");
        System.out.println("Test Einfügen am Anfang (leere Liste)");
        liste1.vorneEinfuegen(patient1);
        liste1.informationAusgeben();
    }

    public void testLaengeGebenVoll()
    {
        System.out.println("---------------");
        System.out.println("Test Längenberechnung (voll)");
        liste1.vorneEinfuegen(patient3);
        liste1.vorneEinfuegen(patient2);
        liste1.vorneEinfuegen(patient1);
        liste1.informationAusgeben();
        System.out.println(liste1.laengeGeben());
        assertEquals(3, liste1.laengeGeben());
    }

    public void testLaengeGebenLeer()
    {
        System.out.println("---------------");
        System.out.println("Test Längenberechnung (leer)");
        System.out.println(liste1.laengeGeben());
        assertEquals(0, liste1.laengeGeben());
    }

    public void testSuchenLeer()
    {
        System.out.println("---------------");
        System.out.println("Test Suchen (leer)");
        assertEquals(null, liste1.suchen("Max"));
    }
    
    public void testSuchenVoll()
    {
        System.out.println("---------------");
        System.out.println("Test Suchen (voll)");
        liste1.vorneEinfuegen(patient3);
        liste1.vorneEinfuegen(patient2);
        liste1.vorneEinfuegen(patient1);
        Datenelement d1 = liste1.suchen("Max");
        assertEquals("Max", ((Patient) d1).name);
        Datenelement d2 = liste1.suchen("Peterchen");
        assertEquals("Peterchen", ((Patient) d2).name);
        Datenelement d3 = liste1.suchen("xxx");
        assertEquals(null, d3);
    }
       
    public void testEinfuegenVor() {
        System.out.println("---------------");
        System.out.println("Test Einfügen vor einem bestimmten anderen");
        liste1.einfuegenVor(patient3,patient1);
        liste1.einfuegenVor(patient2,patient3);
        liste1.einfuegenVor(patient1,patient2);
        liste1.informationAusgeben();
    }
    
    public void testEndeEntfernenLeer() {
        System.out.println("---------------");
        System.out.println("Test Ende entfernen (leer)");
        assertEquals(null, liste1.endeEntfernen());
    }
    
    public void testEndeEntfernenVoll() {
        System.out.println("---------------");
        System.out.println("Test Ende entfernen (voll)");
        liste1.einfuegenVor(patient3,patient1);
        liste1.einfuegenVor(patient2,patient3);
        liste1.einfuegenVor(patient1,patient2);
        Datenelement d = liste1.endeEntfernen();
        assertEquals("Peterchen", ((Patient) d).name);
        liste1.informationAusgeben();
        
    }
    
    public void testAnfangEntfernenLeer() {
        System.out.println("---------------");
        System.out.println("Test Anfang entfernen (leer)");
        assertEquals(null, liste1.anfangEntfernen());
    }
    
    public void testAnfangEntfernenVoll() {
        System.out.println("---------------");
        liste1.einfuegenVor(patient3,patient1);
        liste1.einfuegenVor(patient2,patient3);
        liste1.einfuegenVor(patient1,patient2);
        Datenelement d = liste1.anfangEntfernen();
        assertEquals("Max", ((Patient) d).name);
        liste1.informationAusgeben();
    }
    
    public void testKnotenEntfernenLeer() {
        System.out.println("---------------");
        System.out.println("Test Knoten entfernen (leer)");
        liste1.knotenEntfernen(patient1);
        liste1.informationAusgeben();
    }
    
    public void testKnotenEntfernenVoll() {
        System.out.println("---------------");
        System.out.println("Test Knoten entfernen (voll)");
        liste1.einfuegenVor(patient3,patient1);
        liste1.einfuegenVor(patient2,patient3);
        liste1.einfuegenVor(patient1,patient2);
        liste1.knotenEntfernen(patient3);
        liste1.informationAusgeben();
    }
    
    public void testSortiertEinfuegenVoll() {
        System.out.println("---------------");
        System.out.println("Test Sortiert einfügen (voll)");
        liste1.sortiertEinfuegen(patient1);
        liste1.sortiertEinfuegen(patient3);
        liste1.sortiertEinfuegen(patient2);
        liste1.informationAusgeben();
    }
    
    public void testSortiertEinfuegenLeer() {
        System.out.println("---------------");
        System.out.println("Test Sortiert einfügen (leer)");
        liste1.sortiertEinfuegen(patient1);
        liste1.informationAusgeben();
    }
    
    
}   



